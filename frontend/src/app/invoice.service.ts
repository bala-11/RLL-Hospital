import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Invoice } from './invoice';

@Injectable({
  providedIn: 'root'
})
export class InvoiceService {
  url:string = "http://localhost:9090/admin/api"
  constructor(public http:HttpClient) { }

  viewInvoices(): Observable<Invoice[]>{
    return this.http.get<Invoice[]>(this.url+"/viewInvoices");
  }

  createInvoices(invoice:any): Observable<string> {
   return this.http.post(this.url+"/createInvoices",invoice,{responseType:"text"});
  }

  read(id: any): Observable<Invoice[]> {
    console.log(id)
    return this.http.get<Invoice[]>(this.url+"/gin/"+id);
  }
}
