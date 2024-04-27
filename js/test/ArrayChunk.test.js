const chunk = require("../src/ArrayChunk");

test("case 1", () => {
	const arr = [1,2,3,4,5];
	expect(chunk(arr,1)).toStrictEqual([[1],[2],[3],[4],[5]]);
});

test("case 2", () => {
	const arr = [1,9,6,3,2];
	expect(chunk(arr,3)).toStrictEqual([[1,9,6],[3,2]]);
});

test("case 3", () => {
	const arr = [8,5,3,2,6];
	expect(chunk(arr,6)).toStrictEqual([[8,5,3,2,6]]);
});

test("case 4", () => {
	const arr = [];
	expect(chunk(arr,1)).toStrictEqual([]);
});
