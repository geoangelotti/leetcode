const Array = require("./ArrayLast");

test("case 1", () => {
	const nums = new Array(null, {}, 3);
	expect(nums.last()).toBe(3);
});

test("case 2", () => {
	const nums = new Array();
	expect(nums.last()).toBe(-1);
});