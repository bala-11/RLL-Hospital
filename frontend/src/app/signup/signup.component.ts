import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  msg:string = "";
  loginRef= new FormGroup({
    // id:new FormControl(),
    emailid:new FormControl(),
    password:new FormControl(),
    role:new FormControl()
  });
  constructor(public ls:LoginService) { }

  ngOnInit(): void {
  }

  signUp(){
    let login = this.loginRef.value;
    this.ls.signUp(login).subscribe({
      next:(result:any)=>this.msg=result,
      error:(error:any)=>this.msg=error,
      complete:()=>console.log("completed")
    });
  }

}
