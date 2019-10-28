package com.example.ci.lib

class CILib implements Serializable {
  def final job

  CILib(context) {
    this.job = context
  }

  static def regMatch(scope, reg) {
    return scope.findAll { it.matches(reg) }
  }

}
