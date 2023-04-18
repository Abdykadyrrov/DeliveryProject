<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>List of Trainers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <h3>List of Trainers:</h3>
    <table class="table table-warning table-group-divider">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Title</th>
            <th scope="col">Price</th>
            <th scope="col">Description</th>
        </tr>
        </thead>
        <tbody class="table-group-divider">

        <div>
            <#list allTrainers as trainers>
            <tr>
                <td>${trainers.getId()}</td>
                <td>${trainers.getTitle()}</td>
                <td>${trainers.getPrice()}</td>
                <td>${trainers.getDescription()}</td>
            </tr>
            </#list>
        </div>
        </tbody>
    </table>
</div>
</body>
</html>
