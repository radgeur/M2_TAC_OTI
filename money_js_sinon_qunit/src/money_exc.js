function DevisesIncompatibleExc(_d1,_d2) {
	this.d1=_d1;
	this.d2=_d2;
}

DevisesIncompatibleExc.prototype.toString=function (){
	return "Devises incompatibles : "+this.d1+" vs "+this.d2;
}

function NegativResultExc(_d1,_d2) {
	this.d1=_d1;
	this.d2=_d2;
}

NegativResultExc.prototype.toString=function (){
	return "Le résultat de la soustraction entre : "+this.d1+" et "+this.d2+" est négatif.";
}
