import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class LoginService {
  url:string = "http://localhost:9090/login";
  constructor(public http:HttpClient) { }

  // note1():Observable<any>{
  //   return this.http.get("http://localhost:7070/login/note",{responseType:"text"} );
  // }

  signIn(login:any):Observable<string>{
    return this.http.post(this.url+"/signIn", login,{responseType:"text"});
  }

  signUp(login:any):Observable<string>{
    return this.http.post(this.url+"/signUp", login,{responseType:"text"});
  }

}
