<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>

<div class="d-flex mb-1">
	<p class="text-dark font-weight-medium mb-0 mr-3">
		Nombre de la salida: <a class="text-dark font-weight-semi-bold"
			href="ConsultarSalida?salida=${param.nombreSalida}">${param.nombreSalida}</a>
	</p>
</div>
<div class="d-flex mb-0">
	<p class="text-dark font-weight-medium mb-0 mr-3">Actividad
		asociada:</p>
	<p class="mb-1">${param.nombreActividad}</p>
</div>

<div class="d-flex mb-0">
	<p class="text-dark font-weight-medium mb-0 mr-3">Fecha de salida:</p>
	<p class="mb-1">${param.fechaSalida}</p>
</div>

<div class="d-flex mb-0">
	<p class="text-dark font-weight-medium mb-0 mr-3">Lugar de salida:</p>
	<p class="mb-1">${param.lugarSalida}</p>
</div>

<div class="d-flex mb-0">
	<p class="text-dark font-weight-medium mb-0 mr-3">Cantidad de
		turistas inscriptos:</p>
	<p class="mb-1">${param.cantidadTuristas}</p>
</div>

<div class="d-flex mb-0">
	<p class="text-dark font-weight-medium mb-0 mr-3">Costo:</p>
	<p class="mb-4">$${param.costo}</p>
</div>



