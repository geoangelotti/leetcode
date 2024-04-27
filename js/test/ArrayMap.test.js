const map = require("../src/ArrayMap");

test("case 1", () => {
	const arr = [1, 2, 3];
	function plusone(n) { return n + 1; };
	expect(map(arr, plusone)).toStrictEqual([2, 3, 4]);
});

test("case 2", () => {
	const arr = [1, 2, 3];
	function plusI(n, i) { return n + i; };
	expect(map(arr, plusI)).toStrictEqual([1, 3, 5]);
});

test("case 3", () => {
	const arr = [10, 20, 30];
	function constant() { return 42; };
	expect(map(arr, constant)).toStrictEqual([42, 42, 42]);
});
