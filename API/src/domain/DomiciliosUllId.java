package domain;

// Generated 13-feb-2014 18:05:56 by Hibernate Tools 4.0.0

/**
 * DomiciliosUllId generated by hbm2java
 */
public class DomiciliosUllId implements java.io.Serializable {

	private String codmun;
	private String idvianum;
	private String codviamuni;
	private String codigopseudo;
	private String numero;
	private String duplic;
	private String kilometro;
	private String distrito;
	private String seccion;
	private String entidadCol;
	private String entidadSin;
	private String digitoEntSin;
	private String codigoNucleo;
	private String sector;
	private String manzana;
	private String plano;
	private String codpostal;
	private String geocodigo;
	private String segmento;
	private String refCatastral;
	private String asignadoVct;

	public DomiciliosUllId() {
	}

	public DomiciliosUllId(String codmun, String idvianum, String codviamuni,
			String codigopseudo, String numero, String duplic,
			String kilometro, String distrito, String seccion,
			String entidadCol, String entidadSin, String digitoEntSin,
			String codigoNucleo, String sector, String manzana, String plano,
			String codpostal, String geocodigo, String segmento,
			String refCatastral, String asignadoVct) {
		this.codmun = codmun;
		this.idvianum = idvianum;
		this.codviamuni = codviamuni;
		this.codigopseudo = codigopseudo;
		this.numero = numero;
		this.duplic = duplic;
		this.kilometro = kilometro;
		this.distrito = distrito;
		this.seccion = seccion;
		this.entidadCol = entidadCol;
		this.entidadSin = entidadSin;
		this.digitoEntSin = digitoEntSin;
		this.codigoNucleo = codigoNucleo;
		this.sector = sector;
		this.manzana = manzana;
		this.plano = plano;
		this.codpostal = codpostal;
		this.geocodigo = geocodigo;
		this.segmento = segmento;
		this.refCatastral = refCatastral;
		this.asignadoVct = asignadoVct;
	}

	public String getCodmun() {
		return this.codmun;
	}

	public void setCodmun(String codmun) {
		this.codmun = codmun;
	}

	public String getIdvianum() {
		return this.idvianum;
	}

	public void setIdvianum(String idvianum) {
		this.idvianum = idvianum;
	}

	public String getCodviamuni() {
		return this.codviamuni;
	}

	public void setCodviamuni(String codviamuni) {
		this.codviamuni = codviamuni;
	}

	public String getCodigopseudo() {
		return this.codigopseudo;
	}

	public void setCodigopseudo(String codigopseudo) {
		this.codigopseudo = codigopseudo;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDuplic() {
		return this.duplic;
	}

	public void setDuplic(String duplic) {
		this.duplic = duplic;
	}

	public String getKilometro() {
		return this.kilometro;
	}

	public void setKilometro(String kilometro) {
		this.kilometro = kilometro;
	}

	public String getDistrito() {
		return this.distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getSeccion() {
		return this.seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getEntidadCol() {
		return this.entidadCol;
	}

	public void setEntidadCol(String entidadCol) {
		this.entidadCol = entidadCol;
	}

	public String getEntidadSin() {
		return this.entidadSin;
	}

	public void setEntidadSin(String entidadSin) {
		this.entidadSin = entidadSin;
	}

	public String getDigitoEntSin() {
		return this.digitoEntSin;
	}

	public void setDigitoEntSin(String digitoEntSin) {
		this.digitoEntSin = digitoEntSin;
	}

	public String getCodigoNucleo() {
		return this.codigoNucleo;
	}

	public void setCodigoNucleo(String codigoNucleo) {
		this.codigoNucleo = codigoNucleo;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getManzana() {
		return this.manzana;
	}

	public void setManzana(String manzana) {
		this.manzana = manzana;
	}

	public String getPlano() {
		return this.plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getCodpostal() {
		return this.codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}

	public String getGeocodigo() {
		return this.geocodigo;
	}

	public void setGeocodigo(String geocodigo) {
		this.geocodigo = geocodigo;
	}

	public String getSegmento() {
		return this.segmento;
	}

	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}

	public String getRefCatastral() {
		return this.refCatastral;
	}

	public void setRefCatastral(String refCatastral) {
		this.refCatastral = refCatastral;
	}

	public String getAsignadoVct() {
		return this.asignadoVct;
	}

	public void setAsignadoVct(String asignadoVct) {
		this.asignadoVct = asignadoVct;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DomiciliosUllId))
			return false;
		DomiciliosUllId castOther = (DomiciliosUllId) other;

		return ((this.getCodmun() == castOther.getCodmun()) || (this
				.getCodmun() != null && castOther.getCodmun() != null && this
				.getCodmun().equals(castOther.getCodmun())))
				&& ((this.getIdvianum() == castOther.getIdvianum()) || (this
						.getIdvianum() != null
						&& castOther.getIdvianum() != null && this
						.getIdvianum().equals(castOther.getIdvianum())))
				&& ((this.getCodviamuni() == castOther.getCodviamuni()) || (this
						.getCodviamuni() != null
						&& castOther.getCodviamuni() != null && this
						.getCodviamuni().equals(castOther.getCodviamuni())))
				&& ((this.getCodigopseudo() == castOther.getCodigopseudo()) || (this
						.getCodigopseudo() != null
						&& castOther.getCodigopseudo() != null && this
						.getCodigopseudo().equals(castOther.getCodigopseudo())))
				&& ((this.getNumero() == castOther.getNumero()) || (this
						.getNumero() != null && castOther.getNumero() != null && this
						.getNumero().equals(castOther.getNumero())))
				&& ((this.getDuplic() == castOther.getDuplic()) || (this
						.getDuplic() != null && castOther.getDuplic() != null && this
						.getDuplic().equals(castOther.getDuplic())))
				&& ((this.getKilometro() == castOther.getKilometro()) || (this
						.getKilometro() != null
						&& castOther.getKilometro() != null && this
						.getKilometro().equals(castOther.getKilometro())))
				&& ((this.getDistrito() == castOther.getDistrito()) || (this
						.getDistrito() != null
						&& castOther.getDistrito() != null && this
						.getDistrito().equals(castOther.getDistrito())))
				&& ((this.getSeccion() == castOther.getSeccion()) || (this
						.getSeccion() != null && castOther.getSeccion() != null && this
						.getSeccion().equals(castOther.getSeccion())))
				&& ((this.getEntidadCol() == castOther.getEntidadCol()) || (this
						.getEntidadCol() != null
						&& castOther.getEntidadCol() != null && this
						.getEntidadCol().equals(castOther.getEntidadCol())))
				&& ((this.getEntidadSin() == castOther.getEntidadSin()) || (this
						.getEntidadSin() != null
						&& castOther.getEntidadSin() != null && this
						.getEntidadSin().equals(castOther.getEntidadSin())))
				&& ((this.getDigitoEntSin() == castOther.getDigitoEntSin()) || (this
						.getDigitoEntSin() != null
						&& castOther.getDigitoEntSin() != null && this
						.getDigitoEntSin().equals(castOther.getDigitoEntSin())))
				&& ((this.getCodigoNucleo() == castOther.getCodigoNucleo()) || (this
						.getCodigoNucleo() != null
						&& castOther.getCodigoNucleo() != null && this
						.getCodigoNucleo().equals(castOther.getCodigoNucleo())))
				&& ((this.getSector() == castOther.getSector()) || (this
						.getSector() != null && castOther.getSector() != null && this
						.getSector().equals(castOther.getSector())))
				&& ((this.getManzana() == castOther.getManzana()) || (this
						.getManzana() != null && castOther.getManzana() != null && this
						.getManzana().equals(castOther.getManzana())))
				&& ((this.getPlano() == castOther.getPlano()) || (this
						.getPlano() != null && castOther.getPlano() != null && this
						.getPlano().equals(castOther.getPlano())))
				&& ((this.getCodpostal() == castOther.getCodpostal()) || (this
						.getCodpostal() != null
						&& castOther.getCodpostal() != null && this
						.getCodpostal().equals(castOther.getCodpostal())))
				&& ((this.getGeocodigo() == castOther.getGeocodigo()) || (this
						.getGeocodigo() != null
						&& castOther.getGeocodigo() != null && this
						.getGeocodigo().equals(castOther.getGeocodigo())))
				&& ((this.getSegmento() == castOther.getSegmento()) || (this
						.getSegmento() != null
						&& castOther.getSegmento() != null && this
						.getSegmento().equals(castOther.getSegmento())))
				&& ((this.getRefCatastral() == castOther.getRefCatastral()) || (this
						.getRefCatastral() != null
						&& castOther.getRefCatastral() != null && this
						.getRefCatastral().equals(castOther.getRefCatastral())))
				&& ((this.getAsignadoVct() == castOther.getAsignadoVct()) || (this
						.getAsignadoVct() != null
						&& castOther.getAsignadoVct() != null && this
						.getAsignadoVct().equals(castOther.getAsignadoVct())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodmun() == null ? 0 : this.getCodmun().hashCode());
		result = 37 * result
				+ (getIdvianum() == null ? 0 : this.getIdvianum().hashCode());
		result = 37
				* result
				+ (getCodviamuni() == null ? 0 : this.getCodviamuni()
						.hashCode());
		result = 37
				* result
				+ (getCodigopseudo() == null ? 0 : this.getCodigopseudo()
						.hashCode());
		result = 37 * result
				+ (getNumero() == null ? 0 : this.getNumero().hashCode());
		result = 37 * result
				+ (getDuplic() == null ? 0 : this.getDuplic().hashCode());
		result = 37 * result
				+ (getKilometro() == null ? 0 : this.getKilometro().hashCode());
		result = 37 * result
				+ (getDistrito() == null ? 0 : this.getDistrito().hashCode());
		result = 37 * result
				+ (getSeccion() == null ? 0 : this.getSeccion().hashCode());
		result = 37
				* result
				+ (getEntidadCol() == null ? 0 : this.getEntidadCol()
						.hashCode());
		result = 37
				* result
				+ (getEntidadSin() == null ? 0 : this.getEntidadSin()
						.hashCode());
		result = 37
				* result
				+ (getDigitoEntSin() == null ? 0 : this.getDigitoEntSin()
						.hashCode());
		result = 37
				* result
				+ (getCodigoNucleo() == null ? 0 : this.getCodigoNucleo()
						.hashCode());
		result = 37 * result
				+ (getSector() == null ? 0 : this.getSector().hashCode());
		result = 37 * result
				+ (getManzana() == null ? 0 : this.getManzana().hashCode());
		result = 37 * result
				+ (getPlano() == null ? 0 : this.getPlano().hashCode());
		result = 37 * result
				+ (getCodpostal() == null ? 0 : this.getCodpostal().hashCode());
		result = 37 * result
				+ (getGeocodigo() == null ? 0 : this.getGeocodigo().hashCode());
		result = 37 * result
				+ (getSegmento() == null ? 0 : this.getSegmento().hashCode());
		result = 37
				* result
				+ (getRefCatastral() == null ? 0 : this.getRefCatastral()
						.hashCode());
		result = 37
				* result
				+ (getAsignadoVct() == null ? 0 : this.getAsignadoVct()
						.hashCode());
		return result;
	}

}