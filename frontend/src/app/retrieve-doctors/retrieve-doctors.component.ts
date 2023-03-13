import { Component, OnInit } from '@angular/core';
import { RetrieveDoctor } from '../retrieve-doctor';
import { RetrieveDoctorService } from '../retrieve-doctor.service';
// import { RetrieveDoctors } from '../retrieve-doctors';
// import { RetrieveDoctorsService } from '../retrieve-doctors.service';

@Component({
  selector: 'app-retrieve-doctors',
  templateUrl: './retrieve-doctors.component.html',
  styleUrls: ['./retrieve-doctors.component.css']
})
export class RetrieveDoctorsComponent implements OnInit {
  doctor:Array<RetrieveDoctor>=[]
  constructor(public rds:RetrieveDoctorService) { }

  ngOnInit(): void {
    this.findAllDoctors();

  }
  flag:boolean = false;
  did:number =0;
  address:string ="";
  dage:number=0;
  dgender:string ="";
  dname:string ="";
  dstatus:string ="";
  emailid:string ="";
  phno:string ="";
  specialization:string ="";
  
  findAllDoctors() {
    this.rds.findAllDoctors().subscribe({
      next:(result:any)=>this.doctor=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })

}

deleteDoctor(did:number){
  
  this.rds.deleteDoctorById(did).subscribe({
    next:(result:any)=>console.log(result),
    error:(error:any)=>console.log(error),
    complete:()=>{
        this.findAllDoctors();   
    }
  })
}

approveDoctor(did:number){
  
  this.rds.approveDoctorById(did).subscribe({
    next:(result:any)=>console.log(result),
    error:(error:any)=>console.log(error),
    complete:()=>console.log("completed")
  })
}


rejectDoctor(did:number){
  
  this.rds.rejectDoctorById(did).subscribe({
    next:(result:any)=>console.log(result),
    error:(error:any)=>console.log(error),
    complete:()=>console.log("completed")
  })
}
}