<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>List of movies</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
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
                <td th:text="${trainers.getId()}"/>
                <td th:text="${trainers.getTitle()}"></td>
                <td th:text="${trainers.getPrice()}"></td>
                <td th:text="${trainers.getDescription()}"></td>
            </tr>
            </#list>
        </div>
        </tbody>
    </table>
</div>
</body>
</html>
