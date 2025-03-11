
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
            document.getElementById("modalName").innerText = this.innerText;
            document.getElementById("modalDate").innerText = row.cells[2].innerText;
            document.getElementById("modalAgeText").innerText = row.cells[3].innerText;
            document.getElementById("modalTeamText").innerText = row.cells[4].innerText;
            document.getElementById("modalPositionText").innerText = row.cells[5].innerText;
            document.getElementById("modalHobbyText").innerText = row.cells[6].innerText;
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