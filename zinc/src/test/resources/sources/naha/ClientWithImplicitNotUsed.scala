/*
 * Zinc - The incremental compiler for Scala.
 * Copyright Scala Center, Lightbend, and Mark Harrah
 *
 * Licensed under Apache License 2.0
 * SPDX-License-Identifier: Apache-2.0
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package naha

object ClientWithImplicitNotUsed {
  Seq(NormalDependecy.implicitMember, NormalDependecy.standardMember, WithImplicits.standardMember)
}
