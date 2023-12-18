<%@page import="model.Student" contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Placement Portal</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-success">
            <a class="navbar-brand" href="#">Placement Portal</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="<%=request.getContextPath()%>/showAllStudent">Home</a>
                    </li>
                </ul>

            </div>
        </nav>
                    <%
                        Student stud=(Student)request.getAttribute("student");
                    %>
        <div class="container">
            <div class="text-center">
                <%if(stud.getId()==0){%>
            <h1>New Student</h1>
            <%}%>
                <%if(stud.getId()!=0){%>
            <h1>Edit Student</h1>
            <%}%>
            </div>
              <%if(stud.getId()==0){%>
            <form method="Post" action="insert">
                <div class="form-group">
                    <label for="exampleInputEmail1">Name</label>
                    <input type="text" name="nm" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" name="em" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                  
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">City</label>
                    <input type="text" name="ct" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                   
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" name="pass" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
              
                <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
            <%} else{%>
            <form method="Post" action="update">
                <input type="hidden" name="id" value="<%=stud.getId()%>" >
                <div class="form-group">
                    <label for="exampleInputEmail1">Name</label>
                    <input type="text" name="nm" value="<%=stud.getName()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                    
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" name="em" value="<%=stud.getEmail()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                  
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail1">City</label>
                    <input type="text" name="ct" value="<%=stud.getCity()%>" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                   
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" name="pass" value="<%=stud.getPassword()%>" class="form-control" id="exampleInputPassword1" placeholder="Password">
                </div>
              
                <div class="text-center">
                <button type="submit" class="btn btn-primary">Submit</button>
                </div>
            </form>
            <%}%>
        </div>

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>