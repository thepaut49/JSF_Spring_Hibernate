function ready() {

}

function evenementClick() {
	document.body.style.backgroundColor = '#'
			+ Math.round(Math.random() * 1000);
}

function evenementKanjiClick(element) {
	document.getElementById('toto:input').value += element.value;
}

function translateString(element) {
	var stringToTranslate = element.value;
	// var stringToTranslate = document.getElementById('toto:input').value;
	var newString = '';
	for (var i = 0; i < stringToTranslate.length; i++) {
		switch (stringToTranslate[i]) {
		case 'a':
			newString += 'あ';
			break;
		case 'i':
			newString += 'い';
			break;
		case 'u':
			newString += 'う';
			break;
		case 'e':
			newString += 'え';
			break;
		case 'o':
			newString += 'お';
			break;
		case 'n':
			newString += 'ん';
			break;
		case 'A':
			newString += 'ア';
			break;
		case 'I':
			newString += 'イ';
			break;
		case 'U':
			newString += 'ウ';
			break;
		case 'E':
			newString += 'エ';
			break;
		case 'O':
			newString += 'オ';
			break;
		case 'N':
			newString += 'ン';
			break;
		default:
			newString += stringToTranslate[i];

		}

	}

	console.log("newString avant le 2eme for = " + newString);

	if (newString.length > 1) {
		var newString2Letter = newString[0];
		for (var i = 0; i < newString.length - 1; i++) {
			var string = newString[i] + newString[i + 1];
			switch (string) {
			case 'kあ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'か';
				break;
			case 'kい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'き';
				break;
			case 'kう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'く';
				break;
			case 'kえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'け';
				break;
			case 'kお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'こ';
				break;
			case 'Kア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'カ';
				break;
			case 'Kイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'キ';
				break;
			case 'Kウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ク';
				break;
			case 'Kエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ケ';
				break;
			case 'Kオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'コ';
				break;

			// Ta te to
			case 'tあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'た';
				break;
			case 'tえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'て';
				break;
			case 'tお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'と';
				break;
			case 'Tア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'タ';
				break;
			case 'Tエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'テ';
				break;
			case 'Tオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ト';
				break;

			// sa su se so
			case 'sあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'さ';
				break;
			case 'sう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'す';
				break;
			case 'sえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'せ';
				break;
			case 'sお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'そ';
				break;
			case 'Sア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'サ';
				break;
			case 'Sウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ス';
				break;
			case 'Sエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'セ';
				break;
			case 'Sオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ソ';
				break;

			// !!!!!!!!!!! na ni nu ne no!!!!!!!!!!!
			case 'んあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'な';
				break;
			case 'んい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'に';
				break;
			case 'んう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぬ';
				break;
			case 'んえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ね';
				break;
			case 'んお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'の';
				break;
			case 'ンア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ナ';
				break;
			case 'ンイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ニ';
				break;
			case 'ンウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヌ';
				break;
			case 'ンエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ネ';
				break;
			case 'ンオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ノ';
				break;

			// !!!!!!!!!!! ha hi fu he ho!!!!!!!!!!!
			case 'hあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'は';
				break;
			case 'hい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ひ';
				break;
			case 'fう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ふ';
				break;
			case 'hえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'へ';
				break;
			case 'hお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ほ';
				break;
			case 'Hア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ハ';
				break;
			case 'Hイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヒ';
				break;
			case 'Fウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'フ';
				break;
			case 'Hエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヘ';
				break;
			case 'Hオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ホ';
				break;

			// !!!!!!!!!!! ma mi mu me mo!!!!!!!!!!!
			case 'mあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ま';
				break;
			case 'mい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'み';
				break;
			case 'mう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'む';
				break;
			case 'mえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'め';
				break;
			case 'mお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'も';
				break;
			case 'Mア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'マ';
				break;
			case 'Mイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ミ';
				break;
			case 'Mウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ム';
				break;
			case 'Mエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'メ';
				break;
			case 'Mオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'モ';
				break;

			// !!!!!!!!!!! ya yu yo!!!!!!!!!!!
			case 'yあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'や';
				break;

			case 'yう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ゆ';
				break;
			case 'yお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'よ';
				break;
			case 'Yア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヤ';
				break;
			case 'Yウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ユ';
				break;
			case 'Yオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヨ';
				break;

			// !!!!!!!!!!! ra ri ru re ro!!!!!!!!!!!
			case 'rあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ら';
				break;
			case 'rい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'り';
				break;
			case 'rう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'る';
				break;
			case 'rえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'れ';
				break;
			case 'rお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ろ';
				break;
			case 'Rア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ラ';
				break;
			case 'Rイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'リ';
				break;
			case 'Rウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ル';
				break;
			case 'Rエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'レ';
				break;
			case 'Rオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ロ';
				break;

			// !!!!!!!!!!! wa wo!!!!!!!!!!!
			case 'wあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'わ';
				break;
			case 'wお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'を';
				break;
			case 'Wア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ワ';
				break;
			case 'Wオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヲ';
				break;

			// !!!!!!!!!!! ga gi gu ge go!!!!!!!!!!!
			case 'gあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'が';
				break;
			case 'gい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぎ';
				break;
			case 'gう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぐ';
				break;
			case 'gえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'げ';
				break;
			case 'gお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ご';
				break;
			case 'Gア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ガ';
				break;
			case 'Gイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ギ';
				break;
			case 'Gウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'グ';
				break;
			case 'Gエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ゲ';
				break;
			case 'Gオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ゴ';
				break;

			// !!!!!!!!!!! za ji zu ze zo!!!!!!!!!!!
			case 'zあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ざ';
				break;
			case 'jい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'じ';
				break;
			case 'zう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ず';
				break;
			case 'zえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぜ';
				break;
			case 'zお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぞ';
				break;
			case 'Zア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ザ';
				break;
			case 'Jイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ジ';
				break;
			case 'Zウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ズ';
				break;
			case 'Zエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ゼ';
				break;
			case 'Zオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ゾ';
				break;

			// !!!!!!!!!!! da ji zu de do!!!!!!!!!!!
			case 'dあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'だ';
				break;
			case 'じ=':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぢ';
				break;
			case 'ず=':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'づ';
				break;
			case 'dえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'で';
				break;
			case 'dお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ど';
				break;
			case 'Dア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ダ';
				break;
			case 'ジ=':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヂ';
				break;
			case 'ズ=':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヅ';
				break;
			case 'Dエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'デ';
				break;
			case 'Dオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ド';
				break;

			// !!!!!!!!!!! ba bi bu be bo!!!!!!!!!!!
			case 'bあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ば';
				break;
			case 'bい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'び';
				break;
			case 'bう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぶ';
				break;
			case 'bえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'べ';
				break;
			case 'bお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぼ';
				break;
			case 'Bア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'バ';
				break;
			case 'Bイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ビ';
				break;
			case 'Bウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ブ';
				break;
			case 'Bエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ベ';
				break;
			case 'Bオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ボ';
				break;

			// !!!!!!!!!!! pa pi pu pe po!!!!!!!!!!!
			case 'pあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぱ';
				break;
			case 'pい':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぴ';
				break;
			case 'pう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぷ';
				break;
			case 'pえ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぺ';
				break;
			case 'pお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぽ';
				break;
			case 'Pア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'パ';
				break;
			case 'Pイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ピ';
				break;
			case 'Pウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'プ';
				break;
			case 'Pエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ペ';
				break;
			case 'Pオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ポ';
				break;

			// !!!!!!!!! ja ju jo!!!!!!!!
			case 'jあ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'じゃ';
				break;
			case 'jう':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'じゅ';
				break;
			case 'jお':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'じょ';
				break;
			case 'Jア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ジャ';
				break;
			case 'Jウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ジュ';
				break;
			case 'Jオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ジョ';
				break;

				// !!!!!!!!! va vi vu ve vo !!!!!!!!
			case 'Vア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヴァ';
				break;
			case 'Vイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヴィ';
				break;
			case 'Vウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヴ';
				break;
			case 'Vエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヴェ';
				break;
			case 'Vオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヴォ';
				break;

			// !!!!!!!!!! ti du !!!!!
			case 'Tイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ティ';
				break;
			case 'Dウ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ドゥ';
				break;

			// !!!!!!!!! fa fi fe fo !!!!!!!!
			case 'Fア':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ファ';
				break;
			case 'Fイ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'フィ';
				break;
			case 'Fエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'フェ';
				break;
			case 'Fオ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'フォ';
				break;

			// !!!!!! she je !!!!!!!

			case 'Jエ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ジェ';
				break;

			default:
				newString2Letter += string[1];

			}

		}

		newString = newString2Letter;
		console.log("newString avant 3 eme for = " + newString);

		newString2Letter = newString[0];
		for (var i = 0; i < newString.length - 1; i++) {

			var string = newString[i] + newString[i + 1];
			console.log("newString2Letter 3 eme for string = " + string);
			switch (string) {

			// !!!!!!!!! hya hyu hyo!!!!!!!!
			case 'hや':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ひゃ';
				break;
			case 'hゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ひゅ';
				break;
			case 'hよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ひょ';
				break;
			case 'Hヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヒャ';
				break;
			case 'Hユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヒュ';
				break;
			case 'Hヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ヒョ';
				break;

			// !!!!!!!!! kya kyu kyo!!!!!!!!
			case 'kや':
				console
						.log('@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@');
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'きゃ';
				break;
			case 'kゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'きゅ';
				break;
			case 'kよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'きょ';
				break;
			case 'Kヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'キャ';
				break;
			case 'Kユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'キュ';
				break;
			case 'Kヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'キョ';
				break;

			// !!!!!!!!! gya gyu gyo!!!!!!!!
			case 'gや':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぎゃ';
				break;
			case 'gゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぎゅ';
				break;
			case 'gよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぎょ';
				break;
			case 'Gヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ギャ';
				break;
			case 'Gユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ギュ';
				break;
			case 'Gヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ギョ';
				break;

			// !!!!!!!!! nya nyu nyo!!!!!!!!
			case 'んや':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'にゃ';
				break;
			case 'んゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'にゅ';
				break;
			case 'んよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'にょ';
				break;
			case 'ンヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ニャ';
				break;
			case 'ンユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ニュ';
				break;
			case 'ンヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ニョ';
				break;

			// !!!!!!!!! bya byu byo!!!!!!!!
			case 'bや':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'びゃ';
				break;
			case 'bゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'びゅ';
				break;
			case 'bよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'びょ';
				break;
			case 'Bヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ビャ';
				break;
			case 'Bユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ビュ';
				break;
			case 'Bヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ビョ';
				break;

			// !!!!!!!!! pya pyu pyo!!!!!!!!
			case 'pや':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぴゃ';
				break;
			case 'pゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぴゅ';
				break;
			case 'pよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ぴょ';
				break;
			case 'Pヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ピャ';
				break;
			case 'Pユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ピュ';
				break;
			case 'Pヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ピョ';
				break;

			// !!!!!!!!! mya myu myo!!!!!!!!
			case 'mや':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'みゃ';
				break;
			case 'mゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'みゅ';
				break;
			case 'mよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'みょ';
				break;
			case 'Mヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ミャ';
				break;
			case 'Mユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ミュ';
				break;
			case 'Mヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ミョ';
				break;

			// !!!!!!!!! rya ryu ryo!!!!!!!!
			case 'rや':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'りゃ';
				break;
			case 'rゆ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'りゅ';
				break;
			case 'rよ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'りょ';
				break;
			case 'Rヤ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'リャ';
				break;
			case 'Rユ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'リュ';
				break;
			case 'Rヨ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'リョ';
				break;

			// petit tsu
			case 'つ=':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'っ';
				break;

			case 'ツ=':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ッ';
				break;

			// !!!!!!!!! sha shu sho!!!!!!!!
			case 'sは':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'しゃ';
				break;

			case 'sひ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'し';
				break;
			case 'sほ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'しょ';
				break;
			case 'Sハ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'シャ';
				break;

			case 'Sヒ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'シ';
				break;

			case 'Sヘ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {

					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'シェ';
				break;
			case 'Sホ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ショ';
				break;

			// !!!!!!!!! cha chu cho!!!!!!!!
			case 'cは':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ちゃ';
				break;
			case 'cひ':
				console.log(string);
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ち';
				break;
			case 'cほ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ちょ';
				break;
			case 'Cハ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'チャ';
				break;
			case 'Cヒ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'チ';
				break;

			case 'Cホ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					console.log('newString2Letter[j] =' + newString2Letter[j]);
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'チョ';
				break;

			case 'Cヘ':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'チエ';
				break;

			// !!!!!!!!!! tsu
			case 'tす':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'つ';
				break;

			case 'Tス':
				var indexCaractereAEnlever = newString2Letter.length - 1;
				var tempChaine = '';
				for (var j = 0; j < indexCaractereAEnlever; j++) {
					tempChaine += newString2Letter[j];
				}
				newString2Letter = tempChaine;
				newString2Letter += 'ツ';
				break;

			default:
				newString2Letter += string[1];
				console.log(" 3 eme for defaul case @@@@@@@@@@ = " + string);

			}

		}

		newString = newString2Letter;
		console.log("newString avant 4 eme for = " + newString);
		if (newString.length > 2) {

			newString2Letter = newString[0] + newString[1];
			for (var i = 0; i < newString.length - 2; i++) {
				var string = newString[i] + newString[i + 1] + newString[i + 2];
				// console.log("newString[i]+newString[i+1] + newString[i +
				// 2]"
				// + string);
				switch (string) {

				case 'CHウ':
					var indexCaractereAEnlever = newString2Letter.length - 2;
					var tempChaine = '';
					for (var j = 0; j < indexCaractereAEnlever; j++) {
						tempChaine += newString2Letter[j];
					}
					newString2Letter = tempChaine;
					newString2Letter += 'チュ';
					break;

				case 'chう':
					var indexCaractereAEnlever = newString2Letter.length - 2;
					var tempChaine = '';
					for (var j = 0; j < indexCaractereAEnlever; j++) {
						tempChaine += newString2Letter[j];
					}
					newString2Letter = tempChaine;
					newString2Letter += 'ちゅ';
					break;

				case 'SHウ':
					var indexCaractereAEnlever = newString2Letter.length - 2;
					var tempChaine = '';
					for (var j = 0; j < indexCaractereAEnlever; j++) {
						tempChaine += newString2Letter[j];
					}
					newString2Letter = tempChaine;
					newString2Letter += 'シュ';
					break;

				case 'shう':
					console.log(string);
					var indexCaractereAEnlever = newString2Letter.length - 2;
					var tempChaine = '';
					for (var j = 0; j < indexCaractereAEnlever; j++) {
						tempChaine += newString2Letter[j];
					}
					newString2Letter = tempChaine;
					newString2Letter += 'しゅ';
					break;

				default:
					newString2Letter += string[2];

				}

			}

			newString = newString2Letter;
		}

	}

	element.value = newString;
	element.style.color = 'red';
	newString = '';
	newString2Letter = '';
}
