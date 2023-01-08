<%@page import="webservices.DtActividadTuristica" %>
<%@page import="webservices.DtProveedor" %>
<%@page import="webservices.DtCompraPaquete" %>
<%@page import="webservices.DtInscripcionSalida" %>
<%@page import="webservices.DtSalidaTuristica" %>
<%@page import="webservices.DtTurista" %>
<%@page import="webservices.DtUsuario" %>
<%@page import="com.helpers.Endpoints" %>
<%@page import="com.helpers.EstadoSesionHelper" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.util.List" %>
<%@ page import="com.helpers.RequestKeys" %>
<%@ page import="java.util.Map" %>


<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>

<div class="container-fluid py-1">
    <div class="row px-xl-5">

        <div class="col-lg-5 pb-3">
            <div id="product-carousel" class="carousel slide"
                 data-ride="carousel">
                <img class="w-100 h-100" src="${param.img}" alt="Image">
                <%-- PARAMETRO IMAGEN --%>
            </div>
        </div>

        <div class="col-lg-7 pb-5 top">
            <div class="container-fluid">

                <div class="container responsive-tabs">

                    <ul class="nav nav-tabs" role="tablist">
                        <li class="nav-item"><a id="tab-A" href="#pane-A"
                                                class="nav-link active" data-bs-toggle="tab" role="tab">INFORMACION
                            DE USUARIO</a></li>

                        <%
                            DtUsuario usuario = (DtUsuario) request.getAttribute("usuarioConsultar");
                            Boolean miPerfil = (Boolean) request.getAttribute(RequestKeys.ES_MI_PERFIL);
                            if (usuario instanceof DtTurista) {
                        %>
                        <li class="nav-item"><a id="tab-B" href="#pane-B"
                                                class="nav-link" data-bs-toggle="tab" role="tab">SALIDAS
                            TURISTICAS</a></li>

                        <%
                            if (miPerfil) {
                        %>
                        <li class="nav-item"><a id="tab-C" href="#pane-C"
                                                class="nav-link" data-bs-toggle="tab" role="tab">PAQUETE
                            ACTIVIDADES</a></li>
                        <%
                            }
                        %>

                        <%
                        } else {
                        %>
                        <li class="nav-item"><a id="tab-B" href="#pane-B"
                                                class="nav-link" data-bs-toggle="tab" role="tab">ACTIVIDADES
                            TURISTICAS</a></li>
                        <li class="nav-item"><a id="tab-C" href="#pane-C"
                                                class="nav-link" data-bs-toggle="tab" role="tab">SALIDAS
                            TURISTICAS</a></li>

                        <%
                            if (miPerfil) {
                        %>
                        <li class="nav-item"><a id="tab-D" href="#pane-D"
                                                class="nav-link" data-bs-toggle="tab" role="tab">DEMAS
                            ACTIVIDADES</a></li>
                        <%
                            }
                        %>


                        <%
                            }
                        %>
                    </ul>

                    <!------------------------------------------------------------------------------------------------------------------------>
                    <!----------------------------	TAB DE INFO BASICA	-------------------------->

                    <div id="content" class="tab-content" role="tablist">
                        <div id="pane-A" class="card tab-pane show active" role="tabpanel"
                             aria-labelledby="tab-A">
                            <div class="card-header h-auto" role="tab" id="heading-A">
                                <h5 class="mb-0">
                                    <a data-bs-toggle="collapse" href="#collapse-A"
                                       aria-expanded="true" aria-controls="collapse-A">
                                        INFORMACION DE USUARIO </a>
                                </h5>
                            </div>
                            <div id="collapse-A" class="collapse show"
                                 data-bs-parent="#content" role="tabpanel"
                                 aria-labelledby="heading-A">
                                <div class="card-body">


                                    <!---------------------------- INFO BASICA	-------------------------->

                                    <%
                                        if (!miPerfil && EstadoSesionHelper.hayUsuarioLogueado(request)) {

                                            if ((Boolean) request.getAttribute(RequestKeys.SIGO_AL_USUARIO)) {

                                    %>
                                    <div class="d-flex mb-2">
                                        <button id="${param.nickname}" type="button" style="float: right"
                                                onclick="cambiarEstadoSeguir('${param.nickname}')"
                                                class="btn btn-success btn-default btn-sm waves-effect waves-light">
                                            <i class="icon md-check" aria-hidden="true"></i>Siguiendo
                                        </button>
                                    </div>

                                    <% } else { %>

                                    <div class="d-flex mb-2">
                                        <button id="${param.nickname}" type="button"
                                                onclick="cambiarEstadoSeguir('${param.nickname}')"
                                                class="btn btn-info btn-sm waves-effect waves-light"
                                                href="<%= Endpoints.SEGUIR_USUARIO %>?usuario=${param.nickname}"
                                        >Seguir
                                        </button>
                                    </div>
                                    <%
                                            }
                                        }
                                    %>


                                    <div class="d-flex mb-4">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Tipo de
                                            usuario: ${param.tipo}</p>
                                    </div>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Nickname:</p>
                                        <p class="mb-4">${param.nickname}</p>
                                    </div>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Nombre:</p>
                                        <p class="mb-4">${param.nombre}</p>
                                    </div>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Apellido:</p>
                                        <p class="mb-4">${param.apellido}</p>
                                    </div>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Email:</p>
                                        <p class="mb-4">${param.email}</p>
                                    </div>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Fecha de
                                            nacimiento:</p>
                                        <p class="mb-4">${param.fecha}</p>
                                    </div>


                                    <!---------------------------- SI SOY TURISTA	-------------------------->

                                    <%
                                        if (usuario instanceof DtTurista) {
                                    %>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Nacionalidad:</p>
                                        <p class="mb-4">${param.nacionalidad}</p>
                                    </div>

                                    <%
                                    } else {
                                    %>

                                    <!---------------------------- SI SOY PROVEEDOR	-------------------------->


                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Descripcion:</p>
                                        <p class="mb-4">${param.descripcion}</p>
                                    </div>

                                    <div class="d-flex mb-0">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">Sitio
                                            web:</p>
                                        <p class="mb-4">${param.url}</p>
                                    </div>

                                    <%
                                        }
                                    %>


                                    <div class="d-flex mb-0">
                                        <a type="button" class="text-dark font-weight-semi-bold" data-bs-toggle="modal"
                                           data-bs-target="#seguidores">Seguidores </a>
                                        <p class="text-dark font-weight-medium mb-0 ml-2 mr-2"> y </p>
                                        <a type="button" class="text-dark font-weight-semi-bold" data-bs-toggle="modal"
                                           data-bs-target="#seguidos"> Seguidos</a>

                                        <!---------------------------- SEGUIDORES	-------------------------->

                                        <div class="modal" id="seguidores">
                                            <div class="modal-dialog modal-lg">
                                                <div class="modal-content">

                                                    <!-- Modal Header -->
                                                    <div class="modal-header">
                                                        <h4 class="modal-title">SEGUIDORES</h4>
                                                        <button type="button" class="btn-close"
                                                                data-bs-dismiss="modal"></button>
                                                    </div>

                                                    <!-- Modal body -->
                                                    <div class="modal-body">
                                                        <div class="panel" id="followers">
                                                            <div class="panel-body">
                                                                <ul class="list-group list-group-dividered list-group-full">

                                                                    <%
                                                                        List<DtUsuario> listaSeguidores = (List<DtUsuario>) request.getAttribute(RequestKeys.LISTA_SEGUIDORES);

                                                                        if (listaSeguidores != null && listaSeguidores.size() > 0) {
                                                                            for (DtUsuario seguidor : listaSeguidores) {
                                                                                String nombre = seguidor.getNombre() + " " + seguidor.getApellido();
                                                                                String nickname = seguidor.getNickname();
                                                                    %>
                                                                    <!--- Hay una de estas para cada salida --->
                                                                    <jsp:include
                                                                            page="pestanas/ContenidoSeguidores.jsp">
                                                                        <jsp:param name="tipoLista" value="Seguidores"/>
                                                                        <jsp:param name="nombre" value="<%=nombre%>"/>
                                                                        <jsp:param name="nickname"
                                                                                   value="<%=nickname%>"/>
                                                                    </jsp:include>
                                                                    <%
                                                                            }
                                                                        }
                                                                    %>

                                                                    <%
                                                                        if (listaSeguidores == null || listaSeguidores.size() == 0) {
                                                                    %>
                                                                    <div>
                                                                        <a>No hay seguidores</a>
                                                                    </div>
                                                                    <%
                                                                        }
                                                                    %>

                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <!-- Modal footer -->
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-danger"
                                                                data-bs-dismiss="modal">Cerrrar
                                                        </button>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>


                                        <!---------------------------- SEGUIDOS	-------------------------->


                                        <div class="modal" id="seguidos">
                                            <div class="modal-dialog modal-lg">
                                                <div class="modal-content">

                                                    <!-- Modal Header -->
                                                    <div class="modal-header">
                                                        <h4 class="modal-title">SEGUIDOS</h4>
                                                        <button type="button" class="btn-close"
                                                                data-bs-dismiss="modal"></button>
                                                    </div>

                                                    <!-- Modal body -->
                                                    <div class="modal-body">
                                                        <div class="panel" id="followers">
                                                            <div class="panel-body">
                                                                <ul class="list-group list-group-dividered list-group-full">
                                                                    <%
                                                                        List<DtUsuario> listaSeguidos = (List<DtUsuario>) request.getAttribute(RequestKeys.LISTA_SEGUIDOS);

                                                                        if (listaSeguidos != null && listaSeguidos.size() > 0) {
                                                                            for (DtUsuario seguido : listaSeguidos) {

                                                                                String nombre = seguido.getNombre() + " " + seguido.getApellido();
                                                                                String nickname = seguido.getNickname();

                                                                    %>

                                                                    <jsp:include
                                                                            page="pestanas/ContenidoSeguidores.jsp">
                                                                        <jsp:param name="tipoLista" value="Seguidos"/>
                                                                        <jsp:param name="nombre" value="<%=nombre%>"/>
                                                                        <jsp:param name="nickname"
                                                                                   value="<%=nickname%>"/>
                                                                    </jsp:include>
                                                                    <%
                                                                            }
                                                                        }
                                                                    %>

                                                                    <%
                                                                        if (listaSeguidos == null || listaSeguidos.size() == 0) {
                                                                    %>
                                                                    <div>
                                                                        <a>No hay seguidos</a>
                                                                    </div>
                                                                    <%
                                                                        }
                                                                    %>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <!-- Modal footer -->
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-danger"
                                                                data-bs-dismiss="modal">Cerrar
                                                        </button>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>

                                    </div>


                                </div>
                            </div>
                        </div>


                        <!----------------------------	TABS DE TURISTA	-------------------------->
                        <!------------------------------------------------------------------------------------------------------------------------>
                        <!----------------------------	TAB DE SALIDAS	-------------------------->

                        <%
                            if (usuario instanceof DtTurista) {
                        %>

                        <div id="pane-B" class="card tab-pane" role="tabpanel"
                             aria-labelledby="tab-B">
                            <div class="card-header h-auto" role="tab" id="heading-B">
                                <h5 class="mb-0">
                                    <a class="collapsed" data-bs-toggle="collapse"
                                       href="#collapse-B" aria-expanded="false"
                                       aria-controls="collapse-B"> SALIDAS TURISTICAS </a>
                                </h5>
                            </div>
                            <div id="collapse-B" class="collapse" data-bs-parent="#content"
                                 role="tabpanel" aria-labelledby="heading-B">
                                <div class="card-body">


                                    <%
                                        List<DtSalidaTuristica> salidas = (List<DtSalidaTuristica>) request.getAttribute(RequestKeys.SALIDAS_PERFIL_A_CONSULTAR);

                                        Map<String, DtInscripcionSalida> inscripcionSalidas = (Map<String, DtInscripcionSalida>) request.getAttribute(RequestKeys.INSCRIPCIONES_SALIDAS_PERFIL_A_CONSULTAR);

                                        if (salidas != null && salidas.size() > 0 && inscripcionSalidas != null && !inscripcionSalidas.isEmpty()) {
                                            for (DtSalidaTuristica salida : salidas) {
                                                String nombreSalida = salida.getNombreSalida();
                                                String nombreActividad = salida.getNombreActividad();
                                                String cantidadTur = String.valueOf(salida.getCantidadMaximaTuristas());
                                                String lugarSalida = salida.getLugarSalida();
                                                String fechaSalida = salida.getFechaSalida();

                                                int cantTuristas = inscripcionSalidas.get(nombreSalida).getCantidadTuristas();
                                                float costo = inscripcionSalidas.get(nombreSalida).getCosto();

                                    %>
                                    <! --- Hay una de estas para cada salida --->
                                    <jsp:include page="pestanas/pestanaSalidasTuriMiPerfil.jsp">
                                        <jsp:param name="nombreSalida" value="<%=nombreSalida%>"/>
                                        <jsp:param name="nombreActividad" value="<%=nombreActividad%>"/>
                                        <jsp:param name="cantidadTur" value="<%=cantidadTur%>"/>
                                        <jsp:param name="fechaSalida" value="<%=fechaSalida%>"/>
                                        <jsp:param name="lugarSalida" value="<%=lugarSalida%>"/>
                                        <jsp:param name="nombreSalida" value="<%=nombreSalida%>"/>
                                        <jsp:param name="cantidadTuristas" value="<%=cantTuristas%>"/>
                                        <jsp:param name="costo" value="<%=costo%>"/>
                                    </jsp:include>
                                    <%
                                            }
                                        }
                                    %>

                                    <%
                                        if (salidas == null || salidas.size() == 0 || inscripcionSalidas == null || inscripcionSalidas.isEmpty()) {
                                    %>
                                    <div class="d-flex mb-4">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">No hay salidas</p>
                                    </div>
                                    <%
                                        }
                                    %>


                                </div>
                            </div>
                        </div>


                        <!----------------------------	SI ES MI PERFIL	-------------------------->
                        <!------------------------------------------------------------------------------------------------------------------------>
                        <!----------------------------	TAB DE PAQUETES	-------------------------->


                        <%
                            if (miPerfil) {
                        %>

                        <div id="pane-C" class="card tab-pane" role="tabpanel"
                             aria-labelledby="tab-C">
                            <div class="card-header h-auto" role="tab" id="heading-C">
                                <h5 class="mb-0">
                                    <a data-bs-toggle="collapse" href="#collapse-C"
                                       aria-expanded="true" aria-controls="collapse-C"> PAQUETES
                                        ASOCIADOS </a>
                                </h5>
                            </div>
                            <div id="collapse-C" class="collapse" data-bs-parent="#content"
                                 role="tabpanel" aria-labelledby="heading-C">
                                <div class="card-body">


                                    <%
                                        List<DtCompraPaquete> paquetesComprados = (List<DtCompraPaquete>) request.getAttribute(RequestKeys.LISTA_PAQUETES);
                                        if (paquetesComprados != null && paquetesComprados.size() > 0) {
                                            for (DtCompraPaquete paquete : paquetesComprados) {

                                                String nombrePaquete = paquete.getNombrePaquete();
                                                String fechaCompra = paquete.getFechaCompra().toString();
                                                String cantidadTur = String.valueOf(paquete.getCantidadTuristas());
                                                String costo = String.valueOf(paquete.getPrecio());
                                                String fechaVencimiento = paquete.getValidoHasta().toString();

                                    %>
                                    <jsp:include page="pestanas/pestanaPaquetes.jsp">
                                        <jsp:param name="nombrePaquete" value="<%=nombrePaquete%>"/>
                                        <jsp:param name="fechaCompra" value="<%=fechaCompra%>"/>
                                        <jsp:param name="cantidadTur" value="<%=cantidadTur%>"/>
                                        <jsp:param name="fechaVencimiento" value="<%=fechaVencimiento%>"/>
                                        <jsp:param name="costo" value="<%=costo%>"/>
                                    </jsp:include>
                                    <%
                                            }
                                        }
                                    %>

                                    <%
                                        if (paquetesComprados == null || paquetesComprados.size() == 0) {
                                    %>
                                    <div class="d-flex mb-4">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">No hay paquetes</p>
                                    </div>
                                    <%
                                        }
                                    %>


                                </div>
                            </div>
                        </div>


                        <%
                            }
                        %>


                        <%
                            } //IF DEL TURISTA
                        %>


                        <%
                            if (usuario instanceof DtProveedor) {
                        %>

                        <div id="pane-B" class="card tab-pane" role="tabpanel"
                             aria-labelledby="tab-B">
                            <div class="card-header h-auto" role="tab" id="heading-B">
                                <h5 class="mb-0">
                                    <a class="collapsed" data-bs-toggle="collapse"
                                       href="#collapse-B" aria-expanded="false"
                                       aria-controls="collapse-B"> ACTIVIDADES TURISTICAS </a>
                                </h5>
                            </div>
                            <div id="collapse-B" class="collapse" data-bs-parent="#content"
                                 role="tabpanel" aria-labelledby="heading-B">
                                <div class="card-body">


                                    <%
                                        List<DtActividadTuristica> actividades = (List<DtActividadTuristica>)
                                                request.getAttribute(RequestKeys.ACTIVIDADES_PERFIL_A_CONSULTAR_PROVEEDOR);
                                        if (actividades != null && actividades.size() > 0) {
                                            for (DtActividadTuristica actividad : actividades) {
                                                String nombreActividad = actividad.getNombre();
                                                String link = nombreActividad;
                                                String descripcion = actividad.getDescripcion();
                                                String duracion = String.valueOf(actividad.getDuracionHrs());
                                                String costo = "$" + String.valueOf(actividad.getCostoPorPersona());
                                                String ciudad = actividad.getCiudad();
                                    %>
                                    <jsp:include page="pestanas/proveedorAct.jsp">
                                        <jsp:param name="link" value="<%=link%>"/>
                                        <jsp:param name="nombreActividad" value="<%=nombreActividad%>"/>
                                        <jsp:param name="descripcion" value="<%=descripcion%>"/>
                                        <jsp:param name="duracion" value="<%=duracion%>"/>
                                        <jsp:param name="costo" value="<%=costo%>"/>
                                        <jsp:param name="ciudad" value="<%=ciudad%>"/>
                                        <jsp:param name="tieneSalidasVigentes"
                                                   value="<%=actividad.isTieneSalidasVigentes()%>"/>

                                    </jsp:include>
                                    <%
                                            }
                                        }
                                    %>

                                    <%
                                        if (actividades == null || actividades.size() == 0) {
                                    %>
                                    <div class="d-flex mb-4">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">No hay actividades</p>
                                    </div>
                                    <%
                                        }
                                    %>

                                </div>
                            </div>
                        </div>

                        <div id="pane-C" class="card tab-pane" role="tabpanel"
                             aria-labelledby="tab-C">
                            <div class="card-header h-auto" role="tab" id="heading-C">
                                <h5 class="mb-0">
                                    <a class="collapsed" data-bs-toggle="collapse"
                                       href="#collapse-C" aria-expanded="false"
                                       aria-controls="collapse-C"> SALIDAS TURISTICAS </a>
                                </h5>
                            </div>
                            <div id="collapse-C" class="collapse" data-bs-parent="#content"
                                 role="tabpanel" aria-labelledby="heading-C">
                                <div class="card-body">

                                    <%
                                        List<DtSalidaTuristica> salidas = (List<DtSalidaTuristica>) request.getAttribute(RequestKeys.SALIDAS_PERFIL_A_CONSULTAR);
                                        if (salidas != null && salidas.size() > 0) {
                                            for (DtSalidaTuristica salida : salidas) {
                                                String nombreSalida = salida.getNombreSalida();
                                                String nombreActividad = salida.getNombreActividad();
                                                String cantidadTur = String.valueOf(salida.getCantidadMaximaTuristas());
                                                String lugarSalida = salida.getLugarSalida();

                                                String fechaSalida = salida.getFechaSalida().toString();
                                    %>
                                    <jsp:include page="pestanas/pestanaSalidas.jsp">
                                        <jsp:param name="nombreSalida" value="<%=nombreSalida%>"/>
                                        <jsp:param name="nombreActividad" value="<%=nombreActividad%>"/>
                                        <jsp:param name="cantidadTur" value="<%=cantidadTur%>"/>
                                        <jsp:param name="fechaSalida" value="<%=fechaSalida%>"/>
                                        <jsp:param name="lugarSalida" value="<%=lugarSalida%>"/>
                                    </jsp:include>
                                    <%
                                            }
                                        }
                                    %>

                                    <%
                                        if (salidas == null || salidas.size() == 0) {
                                    %>
                                    <div class="d-flex mb-4">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">No hay salidas</p>
                                    </div>
                                    <%
                                        }
                                    %>

                                </div>
                            </div>
                        </div>

                        <%
                            if (miPerfil) {
                        %>

                        <div id="pane-D" class="card tab-pane" role="tabpanel"
                             aria-labelledby="tab-D">
                            <div class="card-header h-auto" role="tab" id="heading-D">
                                <h5 class="mb-0">
                                    <a data-bs-toggle="collapse" href="#collapse-D"
                                       aria-expanded="true" aria-controls="collapse-D"> DEMAS
                                        ACTIVIDADES </a>
                                </h5>
                            </div>
                            <div id="collapse-D" class="collapse" data-bs-parent="#content"
                                 role="tabpanel" aria-labelledby="heading-D">
                                <div class="card-body">

                                    <%
                                        List<DtActividadTuristica> actividadesNoConfirmadas = (List<DtActividadTuristica>) request.getAttribute(RequestKeys.ACTIVIDADES_MI_PERFIL_PROVEEDOR);
                                        if (actividadesNoConfirmadas.size() > 0) {
                                            for (DtActividadTuristica actividad : actividadesNoConfirmadas) {

                                                String nombreActividad = actividad.getNombre();
                                                String link = nombreActividad;
                                                String descripcion = actividad.getDescripcion();
                                                String duracion = String.valueOf(actividad.getDuracionHrs());
                                                String costo = String.valueOf(actividad.getCostoPorPersona());
                                                String ciudad = actividad.getCiudad();
                                                String estado = actividad.getEstado().toString();
                                    %>
                                    <jsp:include page="pestanas/pestanaProvActMiPerfil.jsp">
                                        <jsp:param name="link" value="<%=link%>"/>
                                        <jsp:param name="nombreActividad" value="<%=nombreActividad%>"/>
                                        <jsp:param name="descripcion" value="<%=descripcion%>"/>
                                        <jsp:param name="duracion" value="<%=duracion%>"/>
                                        <jsp:param name="costo" value="<%=costo%>"/>
                                        <jsp:param name="ciudad" value="<%=ciudad%>"/>
                                        <jsp:param name="estado" value="<%=estado%>"/>
                                    </jsp:include>
                                    <%
                                            }
                                        }
                                    %>

                                    <%
                                        if (actividadesNoConfirmadas == null || actividadesNoConfirmadas.size() == 0) {
                                    %>
                                    <div class="d-flex mb-4">
                                        <p class="text-dark font-weight-medium mb-0 mr-3">No hay mas actividades</p>
                                    </div>
                                    <%
                                        }
                                    %>

                                </div>
                            </div>
                        </div>

                        <%
                            }
                        %>

                        <%
                            }
                        %>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script>
    let cambioEstado = false;

    function cambiarEstadoSeguir(id) {
        cambioEstado = true;
        const boton = document.getElementById(id);
        const initialText = 'Seguir';


        if (boton.textContent.includes(initialText)) {
            boton.textContent = 'Siguiendo';
            boton.className = 'btn btn-success btn-default btn-sm waves-effect waves-light';
            boton.id = id;


            let url = "<%= Endpoints.SEGUIR_USUARIO %>?usuario=" + id;

            fetch(url, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                }, body: JSON.stringify({})
            }).then(response => {
                if (response.ok) {
                } else {
                    throw new Error("Error al finalizar la actividad");
                }
            });


        } else {
            boton.textContent = 'Seguir';
            boton.className = 'btn btn-info btn-sm waves-effect waves-light';
            boton.id = id;

            let url = "<%= Endpoints.DEJAR_DE_SEGUIR_USUARIO %>?usuario=" + id;

            fetch(url, {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                }, body: JSON.stringify({})
            }).then(response => {
                if (response.ok) {
                } else {
                    throw new Error("Error al finalizar la actividad");
                }
            });

        }
    }

    function cambiarEstadoSeguirProv() {
        console.log("gfdgkodfjgoidfg ");
        // refresh page
        location.reload();
    }

    var observer = new MutationObserver(function(mutations) {
        mutations.forEach(function(mutationRecord) {
            // log the mutations
            if (document.getElementById("seguidores").style.display === "none" && cambioEstado) {
                cambiarEstadoSeguirProv();
            }
        });
    });

    var observer2 = new MutationObserver(function(mutations) {
        mutations.forEach(function(mutationRecord) {
            // log the mutations
            if (document.getElementById("seguidos").style.display === "none" && cambioEstado) {
                cambiarEstadoSeguirProv();
            }
        });
    });



    var target = document.getElementById('seguidores');
    observer.observe(target, { attributes : true, attributeFilter : ['style'] });

    var target2 = document.getElementById('seguidos');
    observer2.observe(target2, { attributes : true, attributeFilter : ['style'] });


</script>
