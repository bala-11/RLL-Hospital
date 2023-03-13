import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {

  baseURL:string ="http://localhost:9090/admin-login";
  constructor(public http:HttpClient) //DI 
  { }

  signIn(login:any):Observable<string> {
    return this.http.post(this.baseURL+"/signIn",login,{responseType:"text"});
  }


  
  signUp(login:any):Observable<string> {
    return this.http.post(this.baseURL+"/signUp",login,{responseType:"text"});
  }

  
}
