package forca;

public class Boneco <T>{
	private T cabeca;
	private T tronco;
	private T p_esq;
	private T p_drt;
	private T b_esq;
	private T b_drt;

	public void setCabeca(T cabeca) {
		this.cabeca = cabeca;
	}

	public void setTronco(T tronco) {
		this.tronco = tronco;
	}

	public void setP_esq(T p_esq) {
		this.p_esq = p_esq;
	}
	public void setP_drt(T p_drt) {
		this.p_drt = p_drt;
	}
	public void setB_esq(T b_esq) {
		this.b_esq = b_esq;
	}
	public void setB_drt(T b_drt) {
		this.b_drt = b_drt;
	}

	
}
