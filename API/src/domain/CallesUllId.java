package domain;

// Generated 13-feb-2014 18:05:56 by Hibernate Tools 4.0.0

import java.sql.Clob;

/**
 * CallesUllId generated by hbm2java
 */
public class CallesUllId implements java.io.Serializable {

	private String codmun;
	private String codviamuni;
	private String tvian;
	private String digitocontrol;
	private String nombrelargo;
	private String nombrecorto;
	private String codigoine;
	private Clob observaciones;
	private String activo;

	public CallesUllId() {
	}

	public CallesUllId(String codmun, String codviamuni, String tvian,
			String digitocontrol, String nombrelargo, String nombrecorto,
			String codigoine, Clob observaciones, String activo) {
		this.codmun = codmun;
		this.codviamuni = codviamuni;
		this.tvian = tvian;
		this.digitocontrol = digitocontrol;
		this.nombrelargo = nombrelargo;
		this.nombrecorto = nombrecorto;
		this.codigoine = codigoine;
		this.observaciones = observaciones;
		this.activo = activo;
	}

	public String getCodmun() {
		return this.codmun;
	}

	public void setCodmun(String codmun) {
		this.codmun = codmun;
	}

	public String getCodviamuni() {
		return this.codviamuni;
	}

	public void setCodviamuni(String codviamuni) {
		this.codviamuni = codviamuni;
	}

	public String getTvian() {
		return this.tvian;
	}

	public void setTvian(String tvian) {
		this.tvian = tvian;
	}

	public String getDigitocontrol() {
		return this.digitocontrol;
	}

	public void setDigitocontrol(String digitocontrol) {
		this.digitocontrol = digitocontrol;
	}

	public String getNombrelargo() {
		return this.nombrelargo;
	}

	public void setNombrelargo(String nombrelargo) {
		this.nombrelargo = nombrelargo;
	}

	public String getNombrecorto() {
		return this.nombrecorto;
	}

	public void setNombrecorto(String nombrecorto) {
		this.nombrecorto = nombrecorto;
	}

	public String getCodigoine() {
		return this.codigoine;
	}

	public void setCodigoine(String codigoine) {
		this.codigoine = codigoine;
	}

	public Clob getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(Clob observaciones) {
		this.observaciones = observaciones;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CallesUllId))
			return false;
		CallesUllId castOther = (CallesUllId) other;

		return ((this.getCodmun() == castOther.getCodmun()) || (this
				.getCodmun() != null && castOther.getCodmun() != null && this
				.getCodmun().equals(castOther.getCodmun())))
				&& ((this.getCodviamuni() == castOther.getCodviamuni()) || (this
						.getCodviamuni() != null
						&& castOther.getCodviamuni() != null && this
						.getCodviamuni().equals(castOther.getCodviamuni())))
				&& ((this.getTvian() == castOther.getTvian()) || (this
						.getTvian() != null && castOther.getTvian() != null && this
						.getTvian().equals(castOther.getTvian())))
				&& ((this.getDigitocontrol() == castOther.getDigitocontrol()) || (this
						.getDigitocontrol() != null
						&& castOther.getDigitocontrol() != null && this
						.getDigitocontrol()
						.equals(castOther.getDigitocontrol())))
				&& ((this.getNombrelargo() == castOther.getNombrelargo()) || (this
						.getNombrelargo() != null
						&& castOther.getNombrelargo() != null && this
						.getNombrelargo().equals(castOther.getNombrelargo())))
				&& ((this.getNombrecorto() == castOther.getNombrecorto()) || (this
						.getNombrecorto() != null
						&& castOther.getNombrecorto() != null && this
						.getNombrecorto().equals(castOther.getNombrecorto())))
				&& ((this.getCodigoine() == castOther.getCodigoine()) || (this
						.getCodigoine() != null
						&& castOther.getCodigoine() != null && this
						.getCodigoine().equals(castOther.getCodigoine())))
				&& ((this.getObservaciones() == castOther.getObservaciones()) || (this
						.getObservaciones() != null
						&& castOther.getObservaciones() != null && this
						.getObservaciones()
						.equals(castOther.getObservaciones())))
				&& ((this.getActivo() == castOther.getActivo()) || (this
						.getActivo() != null && castOther.getActivo() != null && this
						.getActivo().equals(castOther.getActivo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodmun() == null ? 0 : this.getCodmun().hashCode());
		result = 37
				* result
				+ (getCodviamuni() == null ? 0 : this.getCodviamuni()
						.hashCode());
		result = 37 * result
				+ (getTvian() == null ? 0 : this.getTvian().hashCode());
		result = 37
				* result
				+ (getDigitocontrol() == null ? 0 : this.getDigitocontrol()
						.hashCode());
		result = 37
				* result
				+ (getNombrelargo() == null ? 0 : this.getNombrelargo()
						.hashCode());
		result = 37
				* result
				+ (getNombrecorto() == null ? 0 : this.getNombrecorto()
						.hashCode());
		result = 37 * result
				+ (getCodigoine() == null ? 0 : this.getCodigoine().hashCode());
		result = 37
				* result
				+ (getObservaciones() == null ? 0 : this.getObservaciones()
						.hashCode());
		result = 37 * result
				+ (getActivo() == null ? 0 : this.getActivo().hashCode());
		return result;
	}

}
