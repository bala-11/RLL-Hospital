import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms'
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg:string = "";
  loginRef= new FormGroup({
    // id:new FormControl(),
    emailid:new FormControl(),
    password:new FormControl(),
    role:new FormControl()
  });

  constructor(public router:Router, public ls:LoginService) { }

  ngOnInit(): void {
  }

  signInNow(){
    let login = this.loginRef.value;
    this.ls.signIn(login).subscribe({
      next:(result:any)=>{
        if(result == "Doctor sucessfully login"){
          // sessionStorage.setItem("userDetails",login.emailid);
          // this.router.navigate(["adminHome"]);
          // this.msg = "Doctor sucessfully login";
          this.router.navigate(["doctor"]);
        }
        else if(result == "Patient successfully login"){
          // sessionStorage.setItem("userDetails",login.emailid);
          // this.router.navigate(["userHome"]);
          // this.msg = "Patient successfully login";
          this.router.navigate(["patient"]);
        }else{
          this.msg = result;
        }
      },
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed..")
    });

  }

}
