<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use App\Models\Agenda;

class ActividadesController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $actividades = Actividades::get();
        return view("actividades.index")->withActividades($actividades);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view("actividades.create");
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $input = $request->all();
        Actividades::create([
            'actividades' => $input['actividad'],
            'modalidad' => $input['modalidad'],
            'fecha' => $input['fecha'],
            'duracion' => $input['duracion'],
            'lugar' => $input['lugar']
        ]);
       
        return redirect(route('actividades.index'));
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        $agenda=Agenda::find($id);
        return view('agenda.edit')->withAgenda($agenda);
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        $agenda=Agenda::find($id);
        $input = $request->all();
        $agenda->nombre=$input['nombre'];
        $agenda->apellidos=$input['apellidos'];
        $agenda->sexo=$input['sexo'];
        $agenda->celular=$input['celular'];
        $agenda->direccion=$input['direccion'];
        $agenda->save();
        return redirect(route('agenda.index'));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $agenda=Agenda::find($id);
        $agenda->delete();
        return redirect(route('agenda.index'));
    }
}
