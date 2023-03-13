import { Component, OnInit } from '@angular/core';
import { Patient } from '../patient';
import { RetrieveDoctorService } from '../retrieve-doctor.service';
// import { RetrieveDoctorsService } from '../retrieve-doctors.service';

@Component({
  selector: 'app-dischargepatient',
  templateUrl: './dischargepatient.component.html',
  styleUrls: ['./dischargepatient.component.css']
})
export class DischargepatientComponent implements OnInit {
  patients:Array<Patient>=[];
  constructor(public rds:RetrieveDoctorService) { }

  ngOnInit(): void {
    this.ViewDischargeList();
  }
  ViewDischargeList(){
    this.rds.ViewDischargeList().subscribe({
      next:(result:any)=>this.patients=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }
  dischargePatient(pid:number){
    if(confirm("Are You sure, You want to discharge this patient?")){
      this.rds.dischargePatientById(pid).subscribe({
        next:(result:any)=>console.log(result),
        error:(error:any)=>console.log(error),
        complete:()=>this.ViewDischargeList()
  
      })

  }}
}
