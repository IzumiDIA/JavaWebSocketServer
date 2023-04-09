/*
 * Copyright (c) 2010-2020 Nathan Rajlich
 *
 *  Permission is hereby granted, free of charge, to any person
 *  obtaining a copy of this software and associated documentation
 *  files (the "Software"), to deal in the Software without
 *  restriction, including without limitation the rights to use,
 *  copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the
 *  Software is furnished to do so, subject to the following
 *  conditions:
 *
 *  The above copyright notice and this permission notice shall be
 *  included in all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 *  EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 *  OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 *  NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 *  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *  WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 *  FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 *  OTHER DEALINGS IN THE SOFTWARE.
 */

package org.java_websocket.exceptions;

import java.io.Serial;

/**
 * exception which indicates that a invalid data was received
 */
public class InvalidDataException extends Exception {

  /**
   * Serializable
   */
  @Serial
  private static final long serialVersionUID = 3731842424390998726L;

  /**
   * attribute which closeCode will be returned
   */
  private final int closeCode;

  /**
   * constructor for a InvalidDataException
   *
   * @param closeCode the closeCode which will be returned
   */
  public InvalidDataException(int closeCode) {
    this.closeCode = closeCode;
  }

  /**
   * constructor for a InvalidDataException.
   *
   * @param closeCode the closeCode which will be returned.
   * @param s         the detail message.
   */
  public InvalidDataException(int closeCode, String s) {
    super(s);
    this.closeCode = closeCode;
  }

  /**
   * constructor for a InvalidDataException.
   *
   * @param closeCode the closeCode which will be returned.
   * @param t         the throwable causing this exception.
   */
  public InvalidDataException(int closeCode, Throwable t) {
    super(t);
    this.closeCode = closeCode;
  }

  /**
   * constructor for a InvalidDataException.
   *
   * @param closeCode the closeCode which will be returned.
   * @param s         the detail message.
   * @param t         the throwable causing this exception.
   */
  public InvalidDataException(int closeCode, String s, Throwable t) {
    super(s, t);
    this.closeCode = closeCode;
  }

  /**
   * Getter closeCode
   *
   * @return the closeCode
   */
  public int getCloseCode() {
    return closeCode;
  }

}
