<script>
var transactions = [220,70,140,9];
var sum=0;
transactions.forEach(myFunction);
function myFunction(value) {
  var amount = value;
if(amount >100) {
var above100 = amount -100;
sum = sum + above100*2;
amount=100;
}
if(amount>50) {
var above50 = amount -50;
sum=sum + above50*1;
}
}
//alert(sum);
document.write(sum)
console.log(sum);
</script>
