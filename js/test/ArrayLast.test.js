const Array = require("../src/ArrayLast");

test("case 1", () => {
	const nums = new Array(null, {}, 3);
	expect(nums.last()).toStrictEqual(3);
});

test("case 2", () => {
	const nums = new Array();
	expect(nums.last()).toStrictEqual(-1);
});