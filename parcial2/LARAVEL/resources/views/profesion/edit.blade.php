<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <form action="{{route('profesion.update',$profesiones->id)}}" method="POST">
      {{ csrf_field() }}
      @method('PUT')
      <label for="profesion">Profesion</label>
      <input type="text" name="profesion" value="{{$profesiones->profesion}}"> <br>

      <input class="btn btn-success" type="submit" value="Actualizar">
    </form>
</body>
</html>
