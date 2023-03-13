import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { RetrieveDoctorService } from '../retrieve-doctor.service';
// import { RetrieveDoctorsService } from '../retrieve-doctors.service';


@Component({
  selector: 'app-adddoctor',
  templateUrl: './adddoctor.component.html',
  styleUrls: ['./adddoctor.component.css']
})
export class AdddoctorComponent implements OnInit {
  doctorRef = new FormGroup({
    did: new FormControl(),
    address:new FormControl(),
    dage:new FormControl(),
    dgender:new FormControl(),
    dname:new FormControl(),
    dstatus:new FormControl(),
    emailid:new FormControl(),
    phno:new FormControl(),
    specialization:new FormControl()
    
    
    
  })
  storeMsg :string =""

  constructor(public rds:RetrieveDoctorService,public router:Router) { }

  ngOnInit(): void {
  }
  saveDoctorDetails() {
    let d = this.doctorRef.value;
    this.rds.saveDoctorDetails(d).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.doctorRef.reset();

}
}
