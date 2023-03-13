import { Component, OnInit } from '@angular/core';
import {FormGroup,FormControl, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { AdminLoginService } from '../admin-login.service';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {
  loginRef = new FormGroup({
    emailid:new FormControl("",Validators.required),
    password:new FormControl("",Validators.required),
  });
  msg:string=""
  constructor(public ls:AdminLoginService,public router:Router) { }

  ngOnInit(): void {
  }

  signIn(){
    let login = this.loginRef.value;
    console.log(login);
    this.ls.signIn(login).subscribe({
      next:(result:any)=>{
        // console.log(result);
        //   this.msg=result;
        if(result == "Admin Login successfull"){
          this.router.navigate(['admin-dashboard']);
        }
        else{
          this.msg=result;
        }
      },
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }
}
