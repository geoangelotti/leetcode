const sleep = require("../src/Sleep");

test("case 1", () => {
	let t = Date.now();
	expect(sleep(100).then(() => Date.now() - t)).toStrictEqual(100);
});

test("case 2", () => {
	let t = Date.now();
	expect(sleep(200).then(() => Date.now() - t)).toStrictEqual(200);
});