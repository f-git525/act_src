
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