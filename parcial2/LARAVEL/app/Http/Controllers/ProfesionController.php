<?php

namespace App\Http\Controllers;

use App\Models\Profesion;
use Illuminate\Http\Request;

class ProfesionController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $profesiones = Profesion::get();
        return view("profesion.index")->withProfesiones($profesiones);
    }

    /**
     * Show the form for creating a new resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function create()
    {
        return view("profesion.create");
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
        Profesion::create([
            'profesion' => $input['profesion'],

        ]);

        return redirect(route('profesion.index'));
    }

    /**
     * Display the specified resource.
     *
     * @param  \App\Models\Profesion  $profesion
     * @return \Illuminate\Http\Response
     */
    public function show(Profesion $profesion)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     *
     * @param  \App\Models\Profesion  $profesion
     * @return \Illuminate\Http\Response
     */
    public function edit($id)
    {
        $profesion=Profesion::find($id);
        return view('profesion.edit')->withProfesiones($profesion);
    }

    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \App\Models\Profesion  $profesion
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request,$id)
    {
        $profesionB=Profesion::find($id);
        $input = $request->all();
        echo $input['profesion'];
        $profesionB->profesion=$input['profesion'];
        $profesionB->save();
        return redirect(route('profesion.index'));
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  \App\Models\Profesion  $profesion
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $profesion=Profesion::find($id);
        $profesion->delete();
        return redirect(route('profesion.index'));
    }
}
