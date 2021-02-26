//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.02.23 a las 10:56:32 AM CET 
//

package es.um.asio.importer.oaipmh.model.xsd;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Clase Java para anonymous complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="estaCompuestoPorArticulo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="estaCompuestoPorPublicacionAcademica"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="organizacionCorrespondiente" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="doi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paginaInicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="paginaFinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaDeAutores" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="unbounded"&gt;
 *                   &lt;element name="Autor" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="autorCorrespondiente" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="palabraClave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneLibroDePublicacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="tieneColeccionDePublicacion" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Numero", namespace = "http://www.openarchives.org/OAI/2.0/")
public class Numero {

	@XmlElement(required = true)
	protected Numero.EstaCompuestoPorArticulo estaCompuestoPorArticulo;
	@XmlElement(required = true)
	protected Numero.EstaCompuestoPorPublicacionAcademica estaCompuestoPorPublicacionAcademica;
	protected Numero.OrganizacionCorrespondiente organizacionCorrespondiente;
	protected String doi;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar fecha;
	protected Integer paginaInicio;
	protected Integer paginaFinal;
	protected String resumen;
	protected Numero.ListaDeAutores listaDeAutores;
	protected Numero.AutorCorrespondiente autorCorrespondiente;
	@XmlElement(required = true)
	protected String titulo;
	protected String palabraClave;
	protected Numero.TieneLibroDePublicacion tieneLibroDePublicacion;
	protected Numero.TieneColeccionDePublicacion tieneColeccionDePublicacion;

	/**
	 * Obtiene el valor de la propiedad estaCompuestoPorArticulo.
	 * 
	 * @return possible object is {@link Numero.EstaCompuestoPorArticulo }
	 * 
	 */
	public Numero.EstaCompuestoPorArticulo getEstaCompuestoPorArticulo() {
		return estaCompuestoPorArticulo;
	}

	/**
	 * Define el valor de la propiedad estaCompuestoPorArticulo.
	 * 
	 * @param value allowed object is {@link Numero.EstaCompuestoPorArticulo }
	 * 
	 */
	public void setEstaCompuestoPorArticulo(Numero.EstaCompuestoPorArticulo value) {
		this.estaCompuestoPorArticulo = value;
	}

	/**
	 * Obtiene el valor de la propiedad estaCompuestoPorPublicacionAcademica.
	 * 
	 * @return possible object is
	 *         {@link Numero.EstaCompuestoPorPublicacionAcademica }
	 * 
	 */
	public Numero.EstaCompuestoPorPublicacionAcademica getEstaCompuestoPorPublicacionAcademica() {
		return estaCompuestoPorPublicacionAcademica;
	}

	/**
	 * Define el valor de la propiedad estaCompuestoPorPublicacionAcademica.
	 * 
	 * @param value allowed object is
	 *              {@link Numero.EstaCompuestoPorPublicacionAcademica }
	 * 
	 */
	public void setEstaCompuestoPorPublicacionAcademica(Numero.EstaCompuestoPorPublicacionAcademica value) {
		this.estaCompuestoPorPublicacionAcademica = value;
	}

	/**
	 * Obtiene el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @return possible object is {@link Numero.OrganizacionCorrespondiente }
	 * 
	 */
	public Numero.OrganizacionCorrespondiente getOrganizacionCorrespondiente() {
		return organizacionCorrespondiente;
	}

	/**
	 * Define el valor de la propiedad organizacionCorrespondiente.
	 * 
	 * @param value allowed object is {@link Numero.OrganizacionCorrespondiente }
	 * 
	 */
	public void setOrganizacionCorrespondiente(Numero.OrganizacionCorrespondiente value) {
		this.organizacionCorrespondiente = value;
	}

	/**
	 * Obtiene el valor de la propiedad doi.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDoi() {
		return doi;
	}

	/**
	 * Define el valor de la propiedad doi.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDoi(String value) {
		this.doi = value;
	}

	/**
	 * Obtiene el valor de la propiedad fecha.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFecha() {
		return fecha;
	}

	/**
	 * Define el valor de la propiedad fecha.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFecha(XMLGregorianCalendar value) {
		this.fecha = value;
	}

	/**
	 * Obtiene el valor de la propiedad paginaInicio.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPaginaInicio() {
		return paginaInicio;
	}

	/**
	 * Define el valor de la propiedad paginaInicio.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setPaginaInicio(Integer value) {
		this.paginaInicio = value;
	}

	/**
	 * Obtiene el valor de la propiedad paginaFinal.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPaginaFinal() {
		return paginaFinal;
	}

	/**
	 * Define el valor de la propiedad paginaFinal.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setPaginaFinal(Integer value) {
		this.paginaFinal = value;
	}

	/**
	 * Obtiene el valor de la propiedad resumen.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getResumen() {
		return resumen;
	}

	/**
	 * Define el valor de la propiedad resumen.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setResumen(String value) {
		this.resumen = value;
	}

	/**
	 * Obtiene el valor de la propiedad listaDeAutores.
	 * 
	 * @return possible object is {@link Numero.ListaDeAutores }
	 * 
	 */
	public Numero.ListaDeAutores getListaDeAutores() {
		return listaDeAutores;
	}

	/**
	 * Define el valor de la propiedad listaDeAutores.
	 * 
	 * @param value allowed object is {@link Numero.ListaDeAutores }
	 * 
	 */
	public void setListaDeAutores(Numero.ListaDeAutores value) {
		this.listaDeAutores = value;
	}

	/**
	 * Obtiene el valor de la propiedad autorCorrespondiente.
	 * 
	 * @return possible object is {@link Numero.AutorCorrespondiente }
	 * 
	 */
	public Numero.AutorCorrespondiente getAutorCorrespondiente() {
		return autorCorrespondiente;
	}

	/**
	 * Define el valor de la propiedad autorCorrespondiente.
	 * 
	 * @param value allowed object is {@link Numero.AutorCorrespondiente }
	 * 
	 */
	public void setAutorCorrespondiente(Numero.AutorCorrespondiente value) {
		this.autorCorrespondiente = value;
	}

	/**
	 * Obtiene el valor de la propiedad titulo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Define el valor de la propiedad titulo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTitulo(String value) {
		this.titulo = value;
	}

	/**
	 * Obtiene el valor de la propiedad palabraClave.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPalabraClave() {
		return palabraClave;
	}

	/**
	 * Define el valor de la propiedad palabraClave.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setPalabraClave(String value) {
		this.palabraClave = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneLibroDePublicacion.
	 * 
	 * @return possible object is {@link Numero.TieneLibroDePublicacion }
	 * 
	 */
	public Numero.TieneLibroDePublicacion getTieneLibroDePublicacion() {
		return tieneLibroDePublicacion;
	}

	/**
	 * Define el valor de la propiedad tieneLibroDePublicacion.
	 * 
	 * @param value allowed object is {@link Numero.TieneLibroDePublicacion }
	 * 
	 */
	public void setTieneLibroDePublicacion(Numero.TieneLibroDePublicacion value) {
		this.tieneLibroDePublicacion = value;
	}

	/**
	 * Obtiene el valor de la propiedad tieneColeccionDePublicacion.
	 * 
	 * @return possible object is {@link Numero.TieneColeccionDePublicacion }
	 * 
	 */
	public Numero.TieneColeccionDePublicacion getTieneColeccionDePublicacion() {
		return tieneColeccionDePublicacion;
	}

	/**
	 * Define el valor de la propiedad tieneColeccionDePublicacion.
	 * 
	 * @param value allowed object is {@link Numero.TieneColeccionDePublicacion }
	 * 
	 */
	public void setTieneColeccionDePublicacion(Numero.TieneColeccionDePublicacion value) {
		this.tieneColeccionDePublicacion = value;
	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class AutorCorrespondiente {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class EstaCompuestoPorArticulo {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class EstaCompuestoPorPublicacionAcademica {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;choice maxOccurs="unbounded"&gt;
	 *         &lt;element name="Autor" minOccurs="0"&gt;
	 *           &lt;complexType&gt;
	 *             &lt;complexContent&gt;
	 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *                 &lt;all&gt;
	 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *                 &lt;/all&gt;
	 *               &lt;/restriction&gt;
	 *             &lt;/complexContent&gt;
	 *           &lt;/complexType&gt;
	 *         &lt;/element&gt;
	 *       &lt;/choice&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "autor" })
	public static class ListaDeAutores {

		@XmlElement(name = "Autor")
		protected List<Numero.ListaDeAutores.Autor> autor;

		/**
		 * Gets the value of the autor property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot.
		 * Therefore any modification you make to the returned list will be present
		 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
		 * for the autor property.
		 * 
		 * <p>
		 * For example, to add a new item, do as follows:
		 * 
		 * <pre>
		 * getAutor().add(newItem);
		 * </pre>
		 * 
		 * 
		 * <p>
		 * Objects of the following type(s) are allowed in the list
		 * {@link Numero.ListaDeAutores.Autor }
		 * 
		 * 
		 */
		public List<Numero.ListaDeAutores.Autor> getAutor() {
			if (autor == null) {
				autor = new ArrayList<Numero.ListaDeAutores.Autor>();
			}
			return this.autor;
		}

		/**
		 * <p>
		 * Clase Java para anonymous complex type.
		 * 
		 * <p>
		 * El siguiente fragmento de esquema especifica el contenido que se espera que
		 * haya en esta clase.
		 * 
		 * <pre>
		 * &lt;complexType&gt;
		 *   &lt;complexContent&gt;
		 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
		 *       &lt;all&gt;
		 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
		 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
		 *       &lt;/all&gt;
		 *     &lt;/restriction&gt;
		 *   &lt;/complexContent&gt;
		 * &lt;/complexType&gt;
		 * </pre>
		 * 
		 * 
		 */
		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {

		})
		public static class Autor {

			protected String id;
			protected String nombre;

			/**
			 * Obtiene el valor de la propiedad id.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getId() {
				return id;
			}

			/**
			 * Define el valor de la propiedad id.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setId(String value) {
				this.id = value;
			}

			/**
			 * Obtiene el valor de la propiedad nombre.
			 * 
			 * @return possible object is {@link String }
			 * 
			 */
			public String getNombre() {
				return nombre;
			}

			/**
			 * Define el valor de la propiedad nombre.
			 * 
			 * @param value allowed object is {@link String }
			 * 
			 */
			public void setNombre(String value) {
				this.nombre = value;
			}

		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class OrganizacionCorrespondiente {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class TieneColeccionDePublicacion {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

	/**
	 * <p>
	 * Clase Java para anonymous complex type.
	 * 
	 * <p>
	 * El siguiente fragmento de esquema especifica el contenido que se espera que
	 * haya en esta clase.
	 * 
	 * <pre>
	 * &lt;complexType&gt;
	 *   &lt;complexContent&gt;
	 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
	 *       &lt;all&gt;
	 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
	 *       &lt;/all&gt;
	 *     &lt;/restriction&gt;
	 *   &lt;/complexContent&gt;
	 * &lt;/complexType&gt;
	 * </pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {

	})
	public static class TieneLibroDePublicacion {

		protected String id;
		protected String nombre;

		/**
		 * Obtiene el valor de la propiedad id.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getId() {
			return id;
		}

		/**
		 * Define el valor de la propiedad id.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setId(String value) {
			this.id = value;
		}

		/**
		 * Obtiene el valor de la propiedad nombre.
		 * 
		 * @return possible object is {@link String }
		 * 
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * Define el valor de la propiedad nombre.
		 * 
		 * @param value allowed object is {@link String }
		 * 
		 */
		public void setNombre(String value) {
			this.nombre = value;
		}

	}

}
