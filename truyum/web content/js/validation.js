function validateMenuItemForm()
{
  var title=document.forms["editMenuForm"]["itemName"].value;
  var price=document.forms["editMenuForm"]["price"].value;
  var launchDate=document.forms["editMenuForm"]["date"].value;
  var category=document.forms["editMenuForm"]["itemType"].value;
  if(title=="")
  {
    alert("Title is required");
    return false;
  }
  else if(title.length<2||title.length>65)
  {
    alert("Title should have 2 to 65 characters");
    return false;  
  }
  if(price=="")
  {
    alert("Price is required");
    return false;
  }
  else if(isNaN(price))
  {
    alert("Price has to be a number");
    return false;
  }
  if(launchDate=="")
  {
    alert("Date of Launch is required");
    return false;
  }
  if(category=="")
  {
    alert("Select one category");
    return false;
  }
  
}