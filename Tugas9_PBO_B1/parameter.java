public class parameter<T1,T2> { 
	private T1 nama; 
	private T2 ktp;

public parameter(T1 nama, T2 ktp){ 
	this.nama = nama; 
	this.ktp = ktp; } 

public T1 getNama() { 
	return nama; 
} 

public void setNama(T1 nama){ 
	this.nama = nama; 
} 
public T2 getKtp() { 
	return ktp; 
} 
public void setKtp(T2 ktp) { 
	this.ktp = ktp; 
	}   
}
