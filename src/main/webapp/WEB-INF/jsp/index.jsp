<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<h1>YO</h1>
	<h1>${message}</h1>

<form method="post" action="/odd">
  <input name="number" type="text" size="5"/>
  <input type="submit" value="Odd?">
</form>

  <h1>result is ${result}</h1>

  <form method="post" action="/listResults">
    <input name="number" type="text" size="5"/>
    <input type="submit" value="Show me list ordering">
  </form>

</body>
</html>