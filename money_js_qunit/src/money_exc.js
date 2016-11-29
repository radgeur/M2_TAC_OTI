function DevisesIncompatibleExc(_d1,_d2) {
	this.d1=_d1; this.d2=_d2;
}

DevisesIncompatibleExc.prototype.toString=function (){
		return "Devises incompatibles : "+this.d1+" vs "+this.d2;
}

function ValueNegativExc(_v){
	this.v=_v;
}

ValueNegativExc.prototype.toString=function (){
	return "The value of " + this.v + " is negativ.";
}

function CurrencyLengthExc(_curr) {
	this.curr=_curr;
}

CurrencyLengthExc.prototype.toString = function() {
	return "The length of currency " + this.curr + " is different than 3."
}
