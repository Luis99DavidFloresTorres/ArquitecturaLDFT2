<?php

namespace Database\Factories;

use App\Models\Agenda;
use Illuminate\Database\Eloquent\Factories\Factory;

class AgendaFactory extends Factory
{
    /**
     * The name of the factory's corresponding model.
     *
     * @var string
     */
    protected $model = Agenda::class;

    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        return [
            'actividad' => $this->faker->name(),
            'modalidad' => $this->faker->lastName(),
            'fecha' => $sexo[rand(0,1)],
            'duracion' => $this->faker->phoneNumber(),
            'lugar' => $this->faker->address

            //
        ];
    }
}
