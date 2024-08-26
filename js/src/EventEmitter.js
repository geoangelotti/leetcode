class EventEmitter {
	constructor() {
		this.events = new Map();
	}

	/**
	 * @param {string} eventName
	 * @param {Function} callback
	 * @return {Object}
	 */
	subscribe(eventName, callback) {
		if (!this.events.has(eventName)) {
			this.events.set(eventName, []);
		}
		const subscribers = this.events.get(eventName);
		const unsubscribe = () => {
			const index = subscribers.indexOf(callback);
			if (index !== -1) {
				subscribers.splice(index, 1);
			}
		};
		subscribers.push(callback);
		return { unsubscribe };
	}

	/**
	 * @param {string} eventName
	 * @param {Array} args
	 * @return {Array}
	 */
	emit(eventName, args = []) {
		const subscribers = this.events.get(eventName);
		const results = [];
		if (!subscribers) {
			return results;
		}
		for (callback of subscribers) {
			results.push(callback(...args));
		};
		return results;
	}
}

module.exports = EventEmitter;