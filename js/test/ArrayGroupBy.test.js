const { expect, test } = require("@jest/globals");
const Array = require("../src/ArrayGroupBy");

test("case 1", () => {
	const array = new Array(
		{ "id": "1" },
		{ "id": "1" },
		{ "id": "2" });
	const fn = function (item) {
		return item.id;
	};
	expect(array.groupBy(fn)).toStrictEqual(
		{
			"1": [{ "id": "1" }, { "id": "1" }],
			"2": [{ "id": "2" }]
		}
	);
});

test("case 2", () => {
	const array = new Array(
		[1, 2, 3],
		[1, 3, 5],
		[1, 5, 9]);
	const fn = function (list) {
		return String(list[0]);
	};
	expect(array.groupBy(fn)).toStrictEqual(
		{
			"1": [[1, 2, 3], [1, 3, 5], [1, 5, 9]]
		}
	);
});

test("case 3", () => {
	const array = new Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	const fn = function (n) {
		return String(n > 5);;
	};
	expect(array.groupBy(fn)).toStrictEqual(
		{
			"true": [6, 7, 8, 9, 10],
			"false": [1, 2, 3, 4, 5]
		}
	);
});