import { Component, InjectOptions, OnInit } from '@angular/core';
import { Invoice } from '../invoice';
import { InvoiceService } from '../invoice.service';

@Component({
  selector: 'app-invoice',
  templateUrl: './invoice.component.html',
  styleUrls: ['./invoice.component.css']
})
export class InvoiceComponent implements OnInit {
  invoices:Array<Invoice> = [];
  constructor(public is:InvoiceService) { }

  ngOnInit(): void {
    this.getAllInvoices();
  }

  getAllInvoices(){
    this.is.viewInvoices().subscribe({
      next:(result:any)=>this.invoices=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

  


}
