import { Component, OnInit } from '@angular/core';
import { RetrieveDoctor } from '../retrieve-doctor';
import { RetrieveDoctorService } from '../retrieve-doctor.service';
// import { RetrieveDoctors } from '../retrieve-doctors';
// import { RetrieveDoctorsService } from '../retrieve-doctors.service';

@Component({
  selector: 'app-view-doctor',
  templateUrl: './view-doctor.component.html',
  styleUrls: ['./view-doctor.component.css']
})
export class ViewDoctorComponent implements OnInit {
  doctors:Array<RetrieveDoctor>=[];
  constructor(public rds : RetrieveDoctorService) {
    
   }

  ngOnInit(): void {
   this.viewDoctorList();

  }
  viewDoctorList() {
    this.rds.findAllDoctors().subscribe({
      next:(result:any)=>this.doctors=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

  deleteDoctor(did:number){
    if(confirm("Are You sure, You want to reject this doctor?")){
    this.rds.deleteDoctorById(did).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{this.viewDoctorList();}

    })
  }
  }

 
    approveDoctor(did:number){
      if(confirm("Are You sure, You want to approve this doctor?")){
      this.rds.approveDoctorById(did).subscribe({
        next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{this.viewDoctorList();}
      })
    }}

    rejectDoctor(did:number){
      if(confirm("Are You sure, You want to reject this doctor?")){
      this.rds.rejectDoctorById(did).subscribe({
        next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{this.viewDoctorList();}
      })
    }}

}
