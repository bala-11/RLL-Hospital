import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
// import { InvoiceService } from '../invoice.service';
import { InvoiceService } from './../invoice.service';

@Component({
  selector: 'app-create-invoice',
  templateUrl: './create-invoice.component.html',
  styleUrls: ['./create-invoice.component.css']
})
export class CreateInvoiceComponent implements OnInit {
  Msg:string = "";
  invoiceRef = new FormGroup({

    admitdate : new FormControl(),
    disease: new FormControl(),
    doctorfee: new FormControl(),
    medicinecost: new FormControl(),
    othercharge: new FormControl(),
    patientaddress: new FormControl(),
    patientmobile: new FormControl(),
    patientname: new FormControl(),
    releasedate: new FormControl(),
    roomcharge: new FormControl()

  })



  constructor(public is:InvoiceService) { }

  ngOnInit(): void {
  }

    createInvoice(){
      let invoice = this.invoiceRef.value;
      this.is.createInvoices(invoice).subscribe({
        next:(result:any)=>this.Msg=result,
        error:(error:any)=>this.Msg=error,
        complete:()=>console.log("completed")
      })
      this.invoiceRef.reset();
    }
}
