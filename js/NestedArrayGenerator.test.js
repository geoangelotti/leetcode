const inorderTraversal = require("./NestedArrayGenerator");

test("case 1", () => {
	const arr = [[[6]], [1, 3], []];
	const gen = inorderTraversal(arr);
	expect(gen.next().value).toStrictEqual(6);
	expect(gen.next().value).toStrictEqual(1);
	expect(gen.next().value).toStrictEqual(3);
});

test("case 1", () => {
	const arr = [];
	const gen = inorderTraversal(arr);
	expect(gen.next().value).toStrictEqual(undefined);
});

