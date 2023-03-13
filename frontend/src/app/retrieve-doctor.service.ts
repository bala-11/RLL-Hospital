import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patient } from './patient';
import { RetrieveDoctor } from './retrieve-doctor';

@Injectable({
  providedIn: 'root'
})
export class RetrieveDoctorService {
  baseUrl:string ="http://localhost:9090/admin"
  constructor(public http:HttpClient) { }

  saveDoctorDetails(doctor:any):Observable<string> {
    return this.http.post(this.baseUrl+"/sdd",doctor,{responseType:"text"});
  }

  savePatientDetails(patient:any):Observable<string> {
    return this.http.post(this.baseUrl+"/spd",patient,{responseType:"text"});
  }

  findAllDoctors():Observable<RetrieveDoctor[]> {
    return this.http.get<RetrieveDoctor[]>(this.baseUrl+"/vdd");
  }
  
  ViewPatientList():Observable<Patient[]> {
    return this.http.get<Patient[]>(this.baseUrl+"/vpd");
  }

  ViewAdmissionList():Observable<Patient[]> {
    return this.http.get<Patient[]>(this.baseUrl+"/val");
  }
  ViewAppointmentList():Observable<Patient[]> {
    return this.http.get<Patient[]>(this.baseUrl+"/vapl");
  }
  ViewDischargeList():Observable<Patient[]> {
    return this.http.get<Patient[]>(this.baseUrl+"/vdr");
  }

    deleteDoctorById(did:number):Observable<string> {
      return this.http.delete(this.baseUrl+"/ddd/"+did,{responseType:"text"});
    }

    approveDoctorById(did:number):Observable<any> {
      return this.http.patch(this.baseUrl+"/ad/"+did,{responseType:"text"});
    }

    rejectDoctorById(did:number):Observable<any> {
      return this.http.patch(this.baseUrl+"/rd/"+did,{responseType:"text"});
    }


    approvePatientById(pid:number):Observable<any> {
      return this.http.patch(this.baseUrl+"/ap/"+pid,{responseType:"text"});
    }

    rejectPatientById(pid:number):Observable<any> {
      return this.http.patch(this.baseUrl+"/rp/"+pid,{responseType:"text"});
    }

    updatePatient(patient:any):Observable<string> {
      return this.http.patch(this.baseUrl+"/aptp/",patient,{responseType:"text"});
    }

    // rejectAppointment(patient:any):Observable<string> {
    //   return this.http.patch(this.baseUrl+"/dp/",patient,{responseType:"text"});
    // }


    dischargePatientById(pid:number):Observable<any> {
      return this.http.patch(this.baseUrl+"/dp/"+pid,{responseType:"text"});
    }
}
