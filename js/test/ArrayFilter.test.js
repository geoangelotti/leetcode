const filter = require("../src/ArrayFilter");

test("case 1", () => {
	const arr = [0,10,20,30];
	function greaterThan10(n) { return n > 10; };
	expect(filter(arr, greaterThan10)).toStrictEqual([20, 30]);
});

test("case 2", () => {
	const arr = [1,2,3];
	function firstIndex(n, i) { return i === 0; };
	expect(filter(arr, firstIndex)).toStrictEqual([1]);
});

test("case 3", () => {
	const arr = [-2,-1,0,1,2];
	function plusOne(n) { return n + 1 };
	expect(filter(arr, plusOne)).toStrictEqual([-2, 0, 1, 2]);
});
