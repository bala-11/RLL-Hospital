import { Component, OnInit } from '@angular/core';
import { RetrieveDoctorService } from 'src/app/retrieve-doctor.service';
// import { Patient } from '../patient';
import { Patient } from 'src/app/patient';
// import { RetrieveDoctorsService } from '../retrieve-doctors.service';
@Component({
  selector: 'app-appointment',
  templateUrl: './appointment.component.html',
  styleUrls: ['./appointment.component.css']
})
export class AppointmentComponent implements OnInit {
  patients:Array<Patient>=[];
  flag:boolean = false;
  dpid:number =0;
  pid:number = 0;
  constructor(public rds:RetrieveDoctorService) { }

  ngOnInit(): void {
    this.viewAppointmentList();
  }

  viewAppointmentList() {
    this.rds.ViewAppointmentList().subscribe({
      next:(result:any)=>this.patients=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
  }

  
 

  updatePatient(patient:any){
    this.flag= true;
    this.dpid=patient.dpid;
    this.pid = patient.pid;
}

  appointpatient(){
    let patient = {dpid:this.dpid,pid:this.pid};
    this.rds.updatePatient(patient).subscribe({
      next:(result:any)=>console.log(result),
      error:(error:any)=>console.log(error),
      complete:()=>{
          this.viewAppointmentList();   
      }
    })
    this.flag = false;
  }
  

}
