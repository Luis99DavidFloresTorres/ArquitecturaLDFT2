@extends('adminlte::layouts.app')

@section('htmlheader_title')
	{{ trans('adminlte_lang::message.home') }}
@endsection


@section('main-content')
    
    <form action="{{route('agenda.store')}}" method="POST">
      {{ csrf_field() }}
      <label for="actividad">Actividades</label>
      <input type="text" name="actividad" > <br>
      <label for="modalidad">Actividades</label>
      <input type="text" name="modalidad" id=""> Modalidad<br>
      <label for="fecha"> Fecha</label>
      <input type="text" name="fecha" id=""> Fecha<br>
      <label for="duracion">Duracion</label>
      <input name="duracion"   >Duracion <br>
      <label for="lugar">Lugar</label>
      <input type="text" name="lugar" > <br>
       <input type="submit" value="Registrar">

    </form>
@stop