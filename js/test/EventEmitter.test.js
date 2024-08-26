const { expect, test } = require("@jest/globals");
const EventEmitter = require("../src/EventEmitter");

test("case 1", () => {
	const emitter = new EventEmitter();
	expect(emitter.emit("firstEvent")).toStrictEqual([]);
	emitter.subscribe("firstEvent", function cb1() { return 5; });
	emitter.subscribe("firstEvent", function cb2() { return 6; });
	expect(emitter.emit("firstEvent")).toStrictEqual([5, 6]);
});

test("case 2", () => {
	const emitter = new EventEmitter();
	emitter.subscribe("firstEvent", function cb1(...args) { return args.join(','); });
	expect(emitter.emit("firstEvent", [1, 2, 3])).toStrictEqual(["1,2,3"]);
	expect(emitter.emit("firstEvent", [3, 4, 6])).toStrictEqual(["3,4,6"]);
});

test("case 3", () => {
	const emitter = new EventEmitter();
	const sub = emitter.subscribe("firstEvent", (...args) => args.join(','));
	expect(emitter.emit("firstEvent", [1, 2, 3])).toStrictEqual(["1,2,3"]);
	expect(sub.unsubscribe()).toBeUndefined();
	expect(emitter.emit("firstEvent", [4, 5, 6])).toStrictEqual([]);
});

test("case 4", () => {
	const emitter = new EventEmitter();
	const sub1 = emitter.subscribe("firstEvent", x => x + 1);
	// eslint-disable-next-line no-unused-vars
	const sub2 = emitter.subscribe("firstEvent", x => x + 2);
	expect(sub1.unsubscribe()).toBeUndefined();
	expect(emitter.emit("firstEvent", [5])).toStrictEqual([7]);
});
