import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { RetrieveDoctorService } from '../retrieve-doctor.service';
// import { RetrieveDoctorService } from '../retrieve-doctor.service';

@Component({
  selector: 'app-addpatient',
  templateUrl: './addpatient.component.html',
  styleUrls: ['./addpatient.component.css']
})
export class AddpatientComponent implements OnInit {
   patientRef = new FormGroup({
    pname:new FormControl(),
    pgender:new FormControl(),
    paddress:new FormControl(),
    page:new FormControl(),
    symptoms:new FormControl(),
    emailid:new FormControl(),
    mobile:new FormControl(),
  })
  storeMsg :string =""
  constructor(public rds:RetrieveDoctorService) { }

  ngOnInit(): void {
  }
  savePatientDetails() {
    let p = this.patientRef.value;
    this.rds.savePatientDetails(p).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

    this.patientRef.reset();

}

}
