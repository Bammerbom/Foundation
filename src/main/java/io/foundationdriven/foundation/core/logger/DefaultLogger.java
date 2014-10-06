/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 FoundationDriven
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.foundationdriven.foundation.core.logger;

import io.foundationdriven.foundation.api.logger.Logger;

public class DefaultLogger implements Logger {

	private org.apache.logging.log4j.Logger logger;
	private String prefix = "";

	public DefaultLogger(org.apache.logging.log4j.Logger _logger){
		logger = _logger;
	}

	@Override
	public void setPrefix(String _prefix) {
		prefix = _prefix;
	}

	@Override
	public void debug(String msg) {
		logger.debug(prefix + msg);
	}

	@Override
	public void debug(String[] msg) {
		for(String s : msg) {
			info(s);
		}
	}

	@Override
	public void info(String msg) {
		logger.info(prefix + msg);
	}

	@Override
	public void info(String[] msg) {
		for(String s : msg) {
			info(s);
		}
	}

	@Override
	public void warning(String msg) {
		logger.warn(msg);
	}

	@Override
	public void warning(String[] msg) {
		for(String s : msg) {
			warning(s);
		}
	}

	@Override
	public void high(String msg) {
		logger.error(msg);
	}

	@Override
	public void high(String[] msg) {
		for(String s : msg) {
			high(s);
		}
	}

	@Override
	public void severe(String msg) {
		logger.fatal(msg);
	}

	@Override
	public void severe(String[] msg) {
		for(String s : msg) {
			severe(s);
		}
	}

}
