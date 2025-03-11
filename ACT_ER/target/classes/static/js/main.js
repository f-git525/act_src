
//判定ボタンの活性・非活性で使用
$(document).ready(function() {
	const radioButtons = $("input[type='radio']");
	const judgeButton = $(".judge_button");

	// ラジオボタンの選択状態を監視
	radioButtons.change(function() {
		if (radioButtons.is(":checked")) {
			judgeButton.prop("disabled", false); // ボタンを活性化
		} else {
			judgeButton.prop("disabled", true); // ボタンを非活性化
		}
	});
});

//モーダル処理
window.onload = function() {
    var modal = document.getElementById("myModal");
    var links = document.getElementsByClassName("modalLink");
    var span = document.getElementsByClassName("close")[0];

    for (var i = 0; i < links.length; i++) {
        links[i].onclick = function() {
            var row = this.parentNode.parentNode; // リンクの親要素の行を取得
            document.getElementById("modalName").innerHTML = this.innerHTML;
            document.getElementById("modalDate").innerHTML = row.cells[2].innerHTML;
            document.getElementById("modalAgeText").innerHTML = row.cells[3].innerHTML;
            document.getElementById("modalTeamText").innerHTML = row.cells[4].innerHTML;
            document.getElementById("modalPositionText").innerHTML = row.cells[5].innerHTML;
            document.getElementById("modalHobbyText").innerHTML = row.cells[6].innerHTML;
            document.getElementById("modalBikou").innerHTML = row.cells[7].innerHTML;
            modal.style.display = "block";
            document.body.classList.add("modal-open");
            return false;
        }
    }

    span.onclick = function() {
        modal.style.display = "none";
        document.body.classList.remove("modal-open");
    }

    window.onclick = function(event) {
        if (event.target == modal) {
            modal.style.display = "none";
            document.body.classList.remove("modal-open");
        }
    }
}