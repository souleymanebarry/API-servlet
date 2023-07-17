<%@ page import="com.barry.web.CreditModel" %>
<%
    CreditModel model = (CreditModel) request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <link rel="stylesheet"  type=text/css href="css/bootstrap.min.css">
    <link rel="stylesheet"  type=text/css href="css/style.css">
</head>
<body>

<p class="spacer"></p>
<div class="container">
    <div class="col-md-6 col-xm-12 col-sm-6 col-md-offset-3">

        <div class="panel panel-primary">
            <div class="panel-heading text-center">Credit simulation</div>
            <div class="panel-body">
                <form action="calculateMonthlyPayment.do" method="post">
                    <div class="form-group">
                        <label class="control-label">Amount: </label>
                        <input class="form-control" type="text" name="amount" value="<%=model.getAmount()%>"/>
                        <span>DH</span>
                    </div>

                    <div class="form-group">
                        <label class="control-label">Rate: </label>
                        <input class="form-control" type="text" name="rate" value="<%=model.getRate()%>" />
                        <span>%</span>
                    </div>

                    <div class="form-group">
                        <label class="control-label">Duration: </label>
                        <input class="form-control" type="text" name="duration" value="<%=model.getDuration()%>" />
                        <span>Months</span>
                    </div>
                    <button class="btn btn-primary" type="submit">Calculate</button>
                </form>
            </div>
            <p></p>
            <div class="spacer">
                <label> MonthlyPayment = <%=model.getMonthlyPayment()%> </label>
            </div>
        </div>

    </div>

</div>
</body>
</html>
