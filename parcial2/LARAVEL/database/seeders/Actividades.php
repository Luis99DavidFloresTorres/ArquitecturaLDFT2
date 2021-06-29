<?php

namespace Database\Seeders;

use Illuminate\Database\Seeder;
use App\Models\Actividades;

class ActividadesSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        Actividades::factory()
            ->count(1000)
            ->create();
    }
}
